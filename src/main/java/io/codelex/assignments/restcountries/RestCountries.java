package io.codelex.assignments.restcountries;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RestCountries {
    public static void main(String[] args) throws IOException {
        String jsonData = getRestCountriesJsonData();
        List<Country> countries = parseRestCountriesJsonData(jsonData);

        System.out.println("Top 10 by population:");
        List<Country> top10pop = countries.stream()
                                         .sorted(Comparator.comparing(Country::getPopulation).reversed())
                                         .limit(10L)
                                         .toList();
        top10pop.forEach(System.out::println);

        System.out.println();
        System.out.println("Top 10 by area:");
        List<Country> top10area = countries.stream()
                                          .filter(country -> country.getArea() != 0)
                                          .sorted(Comparator.comparing(Country::getArea).reversed())
                                          .limit(10L)
                                          .toList();
        top10area.forEach(System.out::println);

        System.out.println();
        System.out.println("Top 10 by density");
        List<Country> top10density = countries.stream()
                                             .filter(country -> country.getDensity() != 0.0)
                                             .sorted(Comparator.comparing(Country::getDensity).reversed())
                                             .limit(10L)
                                             .toList();
        top10density.forEach(System.out::println);

        System.out.println();
        System.out.println("Listing all Countries");
        countries.forEach(System.out::println);
    }

    private static String getLocalRestCountriesJsonData() throws IOException {
        Path fileName = Path.of(Country.class.getResource("eu-countries.json").getPath());
        return Files.readString(fileName);
    }

    private static String getRestCountriesJsonData() {
        try {
            URL url = new URL("https://restcountries.com/v2/regionalbloc/eu?fields=name,capital,currencies,population,area");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responseCode);
            } else {
                StringBuilder builder = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String inputLine;
                while ((inputLine = reader.readLine()) != null) {
                    builder.append(inputLine);
                }
                return builder.toString();
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static List<Country> parseRestCountriesJsonData(String jsonData) {
        List<Country> countries = new ArrayList<>();
        JSONArray jsonArr = new JSONArray(jsonData);
        for (Object countryObj : jsonArr) {
            JSONObject countryJson = (JSONObject) countryObj;
            Country country = new Country(countryJson.getString("name"));
            country.setCapital(countryJson.getString("capital"));
            country.setPopulation(countryJson.getInt("population"));
            if (countryJson.has("area")) {
                country.setArea(countryJson.getDouble("area"));
            }
            for (Object currencyObj : countryJson.getJSONArray("currencies")) {
                JSONObject currencyJson = (JSONObject) currencyObj;
                String code = currencyJson.getString("code");
                String name = currencyJson.getString("name");
                String symbol = currencyJson.getString("symbol");
                Currency currency = new Currency(code, name, symbol);
                country.addCurrency(currency);
            }
            countries.add(country);
        }
        return countries;
    }

}

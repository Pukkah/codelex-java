package io.codelex.notes.day06.currencyconverter;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Map;

public class CurrencyConverter {

    public static void main(String[] args) throws IOException {

        String exchangeRateRawData = getExchangeRates();
        JSONObject exchangeRateObject = new JSONObject(exchangeRateRawData);
        JSONObject exchangeRates = (JSONObject) exchangeRateObject.get("rates");
        Map<String, Object> rateValues = exchangeRates.toMap();

        CurrencyRate[] allRates = new CurrencyRate[rateValues.size()];
        int i = 0;
        for(Map.Entry<String, Object> valuePair: rateValues.entrySet()){
            allRates[i++] = new CurrencyRate(valuePair.getKey(), new BigDecimal(valuePair.getValue().toString()));
        }


        // Print out all currency rates
        for (CurrencyRate rate : allRates) {
            System.out.println(rate);
        }

    }

    public static String getExchangeRates() throws IOException {

        String theURL = "https://api.exchangerate.host/latest";
        URL url = new URL(theURL);
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        StringBuilder inputData = new StringBuilder();
        String inputLine;

        while((inputLine = in.readLine()) != null) {
            inputData.append(inputLine);
        }

        return inputData.toString();
    }

}

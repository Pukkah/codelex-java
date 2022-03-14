package io.codelex.notes.day11;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CountryOfIP {

    public static void main(String[] args) throws IOException {

        System.out.println(getIPLocation("51.118.7.173")); // (valid IP) 51.118.7.173 (invalid IP) 01.118.7.173

    }

    public static String getIPLocation(String IPAAddress) throws IOException {

        String requestURL = "http://ip-api.com/json/" + IPAAddress;
        URL request = new URL(requestURL);
        BufferedReader response = new BufferedReader(new InputStreamReader(request.openStream()));

        StringBuilder responseData = new StringBuilder();
        String responseLine;

        while ((responseLine = response.readLine()) != null) {
            responseData.append(responseLine);
        }

        JSONObject jsonParser = new JSONObject(responseData.toString());

        if (jsonParser.getString("status").equals("fail")) {
            return jsonParser.getString("message");
        }

        return jsonParser.getString("country");
    }

}

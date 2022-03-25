package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);
        Map<String, Set<String>> flightsData = generateFlightsData();
        Queue<String> route = new LinkedList<>();

        System.out.println("What would you like to do:\n" +
                "To display list of the cities enter 1\n" +
                "To exit program enter #"
        );
        String input;
        while (!(input = in.nextLine()).equals("1")) {
            if (input.equals("#")) {
                System.exit(1);
            }
        }
        System.out.println("Available Cities:");
        flightsData.keySet().forEach(System.out::println);
        System.out.println("Enter a city from which you would like to start:");
        while (true) {
            input = in.nextLine();
            Set<String> destinations = flightsData.get(input);
            if (destinations != null) {
                route.add(input);
                if (route.size() > 1 && route.peek().equals(input)) {
                    break;
                }
                System.out.println("Available destinations:");
                destinations.forEach(System.out::println);
                System.out.println("Enter Destination:");
            }
        }
        System.out.println("Final route:");
        System.out.println(String.join(" -> ", route));
        System.out.println("Bye!");
    }

    private static Map<String, Set<String>> generateFlightsData() throws IOException, URISyntaxException {
        Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        List<String> rawFlightData = Files.readAllLines(path, charset);
        Map<String, Set<String>> flights = new HashMap<>();
        for (String flight : rawFlightData) {
            if (flight.length() == 0) {
                continue;
            }
            String[] splitFlight = flight.split(" -> ", 2);
            String origin = splitFlight[0];
            String destination = splitFlight[1];
            if (!flights.containsKey(origin)) {
                flights.put(origin, new HashSet<>());
            }
            flights.get(origin)
                   .add(destination);
        }
        return flights;
    }

}

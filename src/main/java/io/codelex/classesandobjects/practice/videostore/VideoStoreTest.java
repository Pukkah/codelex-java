package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore STORE = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to list video store inventory");

            int n = keyboard.nextInt();
            keyboard.nextLine(); // clear input queue

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    STORE.listInventory();
                default:
                    break;
            }

        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie title");
            String movieTitle = scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            STORE.addVideo(movieTitle);
            STORE.addRating(movieTitle, rating);
            scanner.nextLine(); // clear input queue
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("Enter movie title to rent");
        String movieTitle = scanner.nextLine();
        STORE.rentVideo(movieTitle);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("Enter movie title to return");
        String movieTitle = scanner.nextLine();
        STORE.returnVideo(movieTitle);
        if (STORE.hasVideo(movieTitle)) {
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            STORE.addRating(movieTitle, rating);
            scanner.nextLine(); // clear input queue
        }
    }

}

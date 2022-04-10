package io.codelex.collections.practice;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int number;
            System.out.print("Enter a number: ");
            try {
                number = in.nextInt();
                Set<Integer> numbers = new HashSet<>();
                while (!numbers.contains(number)) {
                    numbers.add(number);
                    number = getDigitList(number)
                            .stream()
                            .map(i -> (int) Math.pow(i, 2))
                            .reduce(0, Integer::sum);
                }
                if (number == 1) {
                    System.out.println("Happy");
                } else {
                    System.out.println("Sad!");
                }
            } catch (Exception e) {
                break;
            } finally {
                in.nextLine();
            }
        }

        System.out.println("Bye!");

    }

    private static List<Integer> getDigitList(int number) {
        List<Integer> digitsList = new ArrayList<>();
        while (number > 0) {
            digitsList.add(number % 10);
            number = number / 10;
        }
        return digitsList;
    }

}

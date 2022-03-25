package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = { "Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla" };

        // replace array with an ArrayList and print out the results
        List<String> arrayList = Arrays.asList(array);
        System.out.println(arrayList);

        // replace array with a HashSet and print out the results
        Set<String> hashSet = new HashSet<>(Arrays.asList(array));
        System.out.println(hashSet);

        // replace array with a HashMap (use brand as key and origination as value) an print out the results
        String[] originationArray = { "Germany", "Germany", "Japan", "Germany", "Germany", "Germany", "USA" };
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], originationArray[i]);
        }
        System.out.println(hashMap);
    }

}

package io.codelex.notes.day08;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;

public class DateAndTime {

    public static void main(String[] args) {

        // java.time.LocalTime - glabā laiku, kurš nav piesaistīts nevienai laika zonai vai datumam
        System.out.println("Local Time: " + LocalTime.now().withSecond(0).withNano(0));
        System.out.println("UTC Time: " + LocalTime.now(ZoneId.of("UTC")).withNano(0));
        System.out.println("Custom Time: " + LocalTime.of(21, 32 , 56));

        // import java.time.LocalDate - glabā datumu bez laika
        System.out.println("Local Date: " + LocalDate.now());
        System.out.println("Custom Date: " + LocalDate.of(1988, 4, 6));

        // java.time.LocalDateTime - apvieno LocalTime un LocalDate
        System.out.println("LocalDateTime: " + LocalDateTime.now().withSecond(0).withNano(0));

        // java.time.Instant - Globālais laiks, jeb UTC milisekundēs kopš January 1st, 1970
        System.out.println(Instant.now());
        System.out.println(Instant.now().toEpochMilli());

        // laika posmu kalkulācijai var izmantot Duration un Period klases
        LocalDate today = LocalDate.now();
        LocalDate birth = LocalDate.of(1988, 4, 6);
        System.out.println(Period.between(birth, today));
        Instant now = Instant.now();
        Instant later = Instant.now();
        System.out.println(Duration.between(now, later).toNanos());

    }

}

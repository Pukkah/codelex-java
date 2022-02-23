package io.codelex.typesandvariables.practice;

import java.util.stream.Stream;

public class Exercise05 {
    public static void main(String[] args) {

        String[] courses = {
                "English III",
                "Precalculus",
                "Music Theory",
                "Biotechnology",
                "Principles of Technology I",
                "Latin II",
                "AP US History",
                "Business Computer Information Systems"
        };
        String[] teachers = {
                "Ms. Lapan",
                "Mrs. Gideon",
                "Mr. Davis",
                "Ms. Palmer",
                "Ms. Garcia",
                "Mrs. Barnett",
                "Ms. Johannessen",
                "Mr. James"
        };

        int indexWidth = String.valueOf(courses.length).length();
        int coursesWidth = Stream.of(courses).map(String::length).max(Integer::compareTo).get();
        int teachersWidth = Stream.of(teachers).map(String::length).max(Integer::compareTo).get();

        String topAndBottom = "+%s+".formatted("-".repeat(indexWidth + coursesWidth + teachersWidth + 8));
        System.out.println(topAndBottom);
        for (int i = 0; i < courses.length; i++) {
            System.out.printf("| %" + indexWidth +"d | %"+ coursesWidth + "s | %" + teachersWidth + "s |\n", i + 1, courses[i], teachers[i]);
        }
        System.out.println(topAndBottom);

    }
}

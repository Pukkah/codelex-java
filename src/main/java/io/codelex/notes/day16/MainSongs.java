package io.codelex.notes.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainSongs {
    public static void main(String[] args) {

        Song songOne = new Song("Hello from Mars", 120, "Cosmoss");
        Song songTwo = new Song("Nightride", 90, "Kavinsky");
        Song songThree = new Song("Ups I Did it Again", 90, "Britney");

        List<Song> playlist = new ArrayList<>();
        playlist.add(songOne);
        playlist.add(songTwo);
        playlist.add(songThree);


        List<String> titles = playlist.stream()
                                      .map(Song::getTitle)
                                      .toList();

        titles.forEach(System.out::println);

        Map<Integer, List<Song>> byDuration = playlist.stream().collect(Collectors.groupingBy(Song::getDuration));
        System.out.println(byDuration);

    }

}

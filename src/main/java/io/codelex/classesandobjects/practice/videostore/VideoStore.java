package io.codelex.classesandobjects.practice.videostore;

import java.util.HashMap;
import java.util.Map;

public class VideoStore {
    private Map<String, Video> inventory;

    public VideoStore() {
        inventory = new HashMap<>();
    }

    public void addVideo(String title) {
        inventory.put(title, new Video(title));
    }

    public void rentVideo(String title) {
        if (hasVideoInStock(title)) {
            inventory.get(title).checkOut();
        }
    }

    public boolean hasVideoInStock(String title) {
        if (hasVideo(title)) {
            return !inventory.get(title).isCheckedOut();
        }
        return false;
    }

    public boolean hasVideo(String title) {
        return inventory.containsKey(title);
    }

    public void returnVideo(String title) {
        if (hasVideo(title) && !hasVideoInStock(title)) {
            inventory.get(title).checkIn();
        }
    }

    public void addRating(String title, int rating) {
        if (hasVideo(title)) {
            inventory.get(title).addRating(rating);
        }
    }

    public void listInventory() {
        for (Video item : inventory.values()) {
            System.out.println(item);
        }
    }

}

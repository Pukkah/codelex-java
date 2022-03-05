package io.codelex.classesandobjects.practice.videostore;

public class Video {

    private String title;
    private boolean checkedOut;
    private int totalRating;
    private int ratings;

    public Video(String title) {
        this.title = title;
        checkedOut = false;
    }

    public void checkOut(){
        checkedOut = true;
    }

    public void checkIn(){
        checkedOut = false;
    }

    public boolean isCheckedOut(){
        return checkedOut;
    }

    public void addRating(int rating) {
        totalRating += rating;
        ratings++;
    }

    public double getRating() {
        if (ratings > 0) {
            return (double) totalRating / ratings;
        }
        return 0;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" (%.1f) %s", title, getRating(), (isCheckedOut() ? "Out" : "Available"));
    }
}

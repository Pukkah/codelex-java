package io.codelex.notes.day16;

public class Song {
    private String title;
    private int duration;
    private String author;

    public Song(String title, int duration, String author) {
        this.title = title;
        this.duration = duration;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", author='" + author + '\'' +
                '}';
    }

}

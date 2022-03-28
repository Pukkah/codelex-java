package io.codelex.notes.day17;

public class Counter {
    private volatile int count = 0;

    public int getCount() {
        return count;
    }

    public synchronized void addToCount() {
        count++;
    }

    public void addToCountVerbose() {
        System.out.println("adding to count");
        synchronized (this) {
            count++;
        }
    }

}

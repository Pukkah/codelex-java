package io.codelex.notes.day17;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    public static void main(String[] args) {
        System.out.println("Hello");
        waitForAWhile();
        System.out.println("World");

        Runnable waitABitMore1 = Threads::waitForAWhile;
        Runnable waitABitMore2 = Threads::waitForAWhile;
        Runnable waitABitMore3 = Threads::waitForAWhile;

        waitABitMore1.run();
        waitABitMore2.run();
        waitABitMore3.run();

        System.out.println("took 9 seconds");

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(waitABitMore1);
        executor.execute(waitABitMore2);
        executor.execute(waitABitMore3);
        executor.shutdown();

        System.out.println("They were executed in background!");

    }

    public static void waitForAWhile() {
        try {
            System.out.println("Going to sleep...");
            Thread.sleep(3000); // 3sec
            System.out.println("Woke up!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

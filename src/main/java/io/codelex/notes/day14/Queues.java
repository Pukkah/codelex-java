package io.codelex.notes.day14;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("John");
        myQueue.add("David");
        myQueue.add("Anna");

        System.out.println("Serving " + myQueue.poll());
        System.out.println("Next in line " + myQueue.peek());
        System.out.println("Serving " + myQueue.poll());
        System.out.println("Serving " + myQueue.poll());

    }

}

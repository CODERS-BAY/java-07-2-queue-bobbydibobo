package com.codersbay;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> firstArrayList = new ArrayList<>();
        Queue firstQueue = new Queue(firstArrayList);

        firstQueue.enqueue(3);
        firstQueue.enqueue(7);
        firstQueue.enqueue(5);
        firstQueue.enqueue(9);
        firstQueue.enqueue(2);
        firstQueue.enqueue(8);

        System.out.println(firstQueue);
        System.out.println("Size: " + firstQueue.size());

        int firstEle = firstQueue.dequeue();

        System.out.println("Erste Element: " +  firstEle);
        System.out.println(firstQueue);

        int[] someArrayToLuk = firstQueue.dequeueMore(2);

        System.out.println("Removed Stuff: " + Arrays.toString(someArrayToLuk));
        System.out.println(firstQueue);
    }

}

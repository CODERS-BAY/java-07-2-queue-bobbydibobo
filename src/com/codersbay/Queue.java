package com.codersbay;

import java.util.ArrayList;

public class Queue {

    public ArrayList<Integer> myQueue;

    public Queue(ArrayList<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    public void enqueue(int newElement){
        this.myQueue.add(newElement);
    }

    public int size(){
        return this.myQueue.size();
    }

    public int dequeue(){

        if (this.myQueue.size() == 0){
            try {
                throw new QueueTooSmallException();
            } catch (QueueTooSmallException e) {
                e.printStackTrace();
            }
        }

        int firstElement = this.myQueue.get(0);
        this.myQueue.remove(0);

        return firstElement;
    }

    public int[] dequeueMore(int n){

        if (this.myQueue.size() == 0){
            try {
                throw new QueueTooSmallException();
            } catch (QueueTooSmallException e) {
                e.printStackTrace();
            }
        }

        int[] tempArray = new int[n];

        for (int i = 0; i < n; i++){
            tempArray[i] = this.myQueue.get(i);
        }

        int counter = 0;
        while (counter < n){
            this.myQueue.remove(0);
            counter++;
        }

        return tempArray;
    }

    @Override
    public String toString() {
        return "Queue{" +
                this.myQueue +
                '}';
    }

}

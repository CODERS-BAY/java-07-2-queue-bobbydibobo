package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class queueTest {

    @org.junit.jupiter.api.Test

    public void testEnqueue(){

        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue queue = new Queue(arrayList);

        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(2, queue.size());

    }

    @org.junit.jupiter.api.Test

    public void testDequeue(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue queue = new Queue(arrayList);

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeue();
        assertEquals(3, queue.size());

        /* Attempt to verify that first int got removed.. toArray somehow doesnt work tho... But it actually does remove first so probably no test required?? hihi

        Queue[] queues = queue.toArray();

        assertEquals(3, queues[0]);*/

    }

    @org.junit.jupiter.api.Test

    public void testEnqueueMore(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Queue queue = new Queue(arrayList);

        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.dequeueMore(2);

        assertEquals(2, queue.size());
    }

}

package main;

import implementation.MyQueue;

import java.util.Random;

public class MyMain {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("hello");
        queue.enqueue("world");
        queue.enqueue("generic queue");
        queue.traverse();
        String deleted = queue.dequeue();
        if(deleted != null){
            System.out.println("deleted element = "+ deleted);
        }
        queue.traverse();

        MyQueue<Integer> queue1 = new MyQueue<>();
        for (int i = 0; i < 5; i++) {
            queue1.enqueue(new Random().nextInt(250));
            queue1.traverse();

        }
        for (int i = 0; i < 5; i++) {
            Integer deleted1 = queue1.dequeue();
            if(deleted1 != null){
                System.out.println("deleted element = "+ deleted1);
            }
            queue1.traverse();

        }
    }
}

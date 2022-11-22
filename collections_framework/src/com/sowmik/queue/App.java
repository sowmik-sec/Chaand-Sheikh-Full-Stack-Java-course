package com.sowmik.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayBlockingQueue<>(6);
		try {
			queue.add(1);
			queue.add(2);
			queue.add(3);
			queue.add(4);
			queue.add(5);
			queue.add(6);
			queue.add(7);
		} catch (IllegalStateException e) {
			System.out.println("queue is full");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(queue.offer(10));
			System.out.println(queue.offer(11));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Integer element : queue) {
			System.out.println(element);
		}
	}
}

package com.sowmik.double_ended_queue_deque;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class App {
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedBlockingDeque<>();
		try {
			deque.add(1);
			deque.add(2);
			deque.add(3);
			deque.add(4);
			deque.add(5);
			deque.add(6);
			deque.add(7);
		} catch (IllegalStateException e) {
			System.out.println("queue is full");
			//e.printStackTrace();
		}
		
		try {
			System.out.println(deque.offer(10));
			System.out.println(deque.offer(11));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		deque.addFirst(16);
		System.out.println(deque.offerFirst(55));
		for(Integer element : deque) {
			System.out.println(element);
		}
	}
}

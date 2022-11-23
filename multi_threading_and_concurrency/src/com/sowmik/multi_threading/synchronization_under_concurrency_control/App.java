package com.sowmik.multi_threading.synchronization_under_concurrency_control;

public class App {
	public static int counter = 0;
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					counter++;
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=1000;i++) {
					counter++;
				}
				
			}
		});
		
		
		thread1.start();
		thread2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(counter);
	}
}

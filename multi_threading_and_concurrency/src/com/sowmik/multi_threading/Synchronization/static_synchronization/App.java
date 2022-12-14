package com.sowmik.multi_threading.Synchronization.static_synchronization;


class Brakets {
	

	synchronized public static void generate(String threadCode) {
		Object lock = "lock";
		//synchronized (lock) {
			for(int i=1; i<=10; i++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(i<=5) {
					System.out.print("[");
				}
				else {
					System.out.print("]");
				}
			}
			//System.out.println();
		//}
		
		System.out.println("Generated by thread: "+threadCode);
	}
}

public class App {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++) {
					Brakets.generate("Thread 1");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 1 was: "+(endTime-startTime));
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++) {
					Brakets.generate("Thread 2");
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was: "+(endTime-startTime));
			}
		}).start();
	}
}

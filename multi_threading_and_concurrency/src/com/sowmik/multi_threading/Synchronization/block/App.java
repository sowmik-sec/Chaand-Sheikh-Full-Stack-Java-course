package com.sowmik.multi_threading.Synchronization.block;


class Brakets {
	public void generate() {
		Object lock = "lock";
		synchronized (lock) {
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
			System.out.println();
		}
		
		
		for(int j=0; j <=10; j++) {
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class App {
	public static void main(String[] args) {
		Brakets braket = new Brakets();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				long startTime = System.currentTimeMillis();
				for(int i=1; i<=5; i++) {
					braket.generate();
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
					braket.generate();
				}
				long endTime = System.currentTimeMillis();
				System.out.println("Time required for thread 2 was: "+(endTime-startTime));
			}
		}).start();
	}
}

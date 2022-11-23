package com.sowmik.multi_threading.creating_thread_by_extending_the_thread_class;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe() {
		for(int i=1; i<=9; i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value of i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	
}

public class App {
	public static void main(String[] args) {
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
		counter1.start();		// Run should be called by JVM
		System.out.println("*********************");
		counter2.start();		// Run should be called by JVM
		try {
			Thread.sleep(4500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total time required to process: "+(endTime-startTime));
	}
}

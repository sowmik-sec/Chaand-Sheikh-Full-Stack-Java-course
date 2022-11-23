package com.sowmik.multi_threading.wait_and_notify;

public class App {
	
	public static int balance = 0;
	public void withdraw(int amount) {
		synchronized (this) {
			if(balance <= 0) {
				try {
					System.out.println("Waiting for balance updation.");
					wait(5100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		balance -= amount;
		System.out.println("Withdrawal successfull and the current balance is: "+balance);
	}
	
	public void deopsit(int amount) {
		System.out.println("We are depositing the amount");
		balance += amount;
		synchronized (this) {
			notifyAll();
		}
	}

	public static void main(String[] args) {
		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				app.withdraw(1000);
			}
		});
		thread1.setName("Thread1");
		thread1.start();
		
		Thread thread2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				app.deopsit(2000);
			}
		});
		
		thread2.setName("Thread2");
		thread2.start();
	}

}

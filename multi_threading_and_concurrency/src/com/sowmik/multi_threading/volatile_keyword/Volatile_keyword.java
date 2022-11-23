package com.sowmik.multi_threading.volatile_keyword;

public class Volatile_keyword {
	volatile private static int flag = 0;
	public static void main(String args[]) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					if(flag == 0) {
						System.out.println("Running");
					}
					else {
						break;
					}
				}
				
			}
		}).start();;
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Volatile_keyword.flag = 1;
				System.out.println("Flag value updated!");
			}
		}).start();
	}
}

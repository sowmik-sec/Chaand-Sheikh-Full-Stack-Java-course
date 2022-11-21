package com.sowmik.inner_classes.anonymous_Inner_class;

abstract class Lock {
	public abstract boolean isUnlocked(String keyCode);
	
	public void test() {
		System.out.println("test");
	}
}

public class Door {
	Lock lock = new Lock() {

		@Override
		public boolean isUnlocked(String keyCode) {
			if(keyCode.equals("qwerty")) {
				return true;
			}
			else {
				return false;
			}
		}
	};

	public Lock getLock() {
		return lock;
	}
	
}

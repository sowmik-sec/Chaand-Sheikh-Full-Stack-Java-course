package com.sowmik.inner_classes.local_Inner_class;

public class Door {
	public boolean isLocked(String key) {
		class Lock {
			public boolean isLocked(String key) {
				if(key.equals("qwerty")) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return new Lock().isLocked(key);
	}
}

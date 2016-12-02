package com.common.auth;

public enum Whether {

	YES(1),
	NO(0);
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	Whether (int value){
		this.value = value;
	}
	
}

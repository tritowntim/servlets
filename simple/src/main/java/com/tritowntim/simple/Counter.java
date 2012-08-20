package com.tritowntim.simple;

public class Counter {
	
	static int i = 0;
	
	public static String count() {
		i++;
		return String.valueOf(i);
	}
}

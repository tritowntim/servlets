package com.tritowntim.simple;

public class Counter {
	
	static int i = 0;
	public String base = "33";
	
	public static String count() {
		i++;
		return String.valueOf(i);
	}
	
	public static String introduce() {
		return "The value of the counter is ";
	}
	
	public Counter() {
		System.out.println("Counter");
	}
	
	public String getBase() {
		return base;
	}
	
	public void setBase(String val) {
		base = val;
	}
	
	public String getBaseItalics() {
		return "<em>" + base + "</em>";
	}
	
    public int geti() {
    	return i;
    }
}

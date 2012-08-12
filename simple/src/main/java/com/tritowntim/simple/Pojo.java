package com.tritowntim.simple;

public class Pojo {
	
	private String name;
	private String description;
	
	public Pojo(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String toString() {
		return this.name + ", " + this.description;
	}

}

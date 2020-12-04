package com.map;

public class Students {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + "]";
	}

	public Students(String name) {
		super();
		this.name = name;
	}

	public Students() {
		super();
	}


	

}

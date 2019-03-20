package com.yodlee.microservices.architecture.employee;

public class Employee {
	
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

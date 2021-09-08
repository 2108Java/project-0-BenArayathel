package com.example.models;

public class Fruit {
	
	private int id;
	private String name;
	public Fruit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Fruit() {
		super();
		// TODO Auto-generated constructor stub
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

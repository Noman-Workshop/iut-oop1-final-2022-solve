package org.example.ques2;

public class Soldier {
	
	private String name;
	private int rank;
	private int health;
	private String location;
	
	public Soldier(String name, int rank, int health, String location) {
		this.name = name;
		this.rank = rank;
		this.health = health;
		this.location = location;
	}
	
	public void move(String location) {
		this.location = location;
	}
	
	public void takeDamage(int damage) {
		this.health -= damage;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRank() {
		return rank;
	}
	
	public int getHealth() {
		return health;
	}
	
	public String getLocation() {
		return location;
	}
}

package com.Projekat3;

public class Enemy extends GameObject{
	
	private String type;
	private int damage;
	private int health;
	
	public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height);
		setType(type);
		setDamage(damage);
		setHealth(health);
	}

	public String getType() {return type;}
	public void setType(String type) {this.type = type;}

	public int getDamage() {return damage;}
	public void setDamage(int damage) {this.damage = damage;}

	public int getHealth() {return health;}
	public void setHealth(int health) {this.health = health;}

	@Override
	public String toString() {
		return "Enemy [type=" + type + ", damage=" + damage + ", health=" + health + "]" + super.toString();
	}
	
	
	
	
	

}

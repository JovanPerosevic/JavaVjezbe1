package com.Vjezbe4;

class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	public Player(int x, int y, int width, int height, int health) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}

	public int getX() {return x; }
	public void setX(int x) {this.x = x;}

	public int getY() {return y;}
	public void setY(int y) {this.y = y;}

	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}

	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}

	public int getHealth() {return health;}
	public void setHealth(int health) {
		if(health <= 100 & health > 0)
			this.health = health;
		}
}

class Enemy {
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	public Enemy(int x, int y, int width, int height, int damage) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}

	public int getX() {return x; }
	public void setX(int x) {this.x = x;}

	public int getY() {return y;}
	public void setY(int y) {this.y = y;}

	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}

	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}

	public int getDamage() {return damage;}
	public void setDamage(int damage) {
		if(damage <= 100 & damage > 0)
			this.damage = damage;
		}
}

public class Game {
	
	public static boolean checkCollision(Player p, Enemy e) {
		return (p.getX() < e.getX() + e.getWidth() &&
				p.getX() + p.getWidth() > e.getX() &&
				p.getY() < e.getY() + e.getHeight() &&
				p.getY() + p.getHeight() > e.getY());
	}
	
	public static void decreaseHealth(Player p, Enemy e) {
		if(checkCollision(p, e)) {
			int novoHealth = p.getHealth() - e.getDamage();
			if (novoHealth < 0) novoHealth = 0;
			p.setHealth(novoHealth);
			
		}
	}
	
}

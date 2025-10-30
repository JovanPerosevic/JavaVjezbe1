package com.Projekat3;

public class BossEnemy extends Enemy{

	public BossEnemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height, type, damage * 2, health);
	}

	@Override
	public String toString() {
		return "BossEnemy []" + super.toString();
	}
	
	

}

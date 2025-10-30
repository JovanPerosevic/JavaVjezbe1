package com.Projekat3;

public class Player extends GameObject{
	
	private String ime;
	private int health;
	
	public Player(int x, int y, int width, int height, String ime, int health) {
		super(x, y, width, height);
		setIme(ime);
		setHealth(health);
	}

	public String getIme() {return ime;}
	public void setIme(String ime) {this.ime = ime;}

	public int getHealth() {return health;}
	public void setHealth(int zivotniPoeni) {
		if(zivotniPoeni >= 0 && zivotniPoeni <= 100)
			health = zivotniPoeni;
	}

	@Override
	public String toString() {
		return "Player [ime=" + ime + ", health=" + health + "]" + super.toString();
	}

	
	
	
	
	
	
	
	

}

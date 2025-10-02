package com.Projekat;

//Jovan Perosevic 24/047; Marko Tomic 19/011; Erdan Franca 22/005;

public class Enemy {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	private int damage;
	
	public Enemy (int x, int y, int width, int height, int health, int damage) {
		int koordinataX = x;
		int koordinataY = y;
		int sirina = width;
		int visina = height;
		int zdravlje = health;
		int napad = damage;
		}
	//Metoda klase
	
	public int getKoordinataX() {return x;}
	public int getKoordinataY() {return y;}
	public int getSirina() {return width;}
	public int getVisina() {return height;}
	public int getZdravle() {return health;}
	public int Napad() {return damage;}
	//Geteri
	
	public void setKoordinataX(int x) {
		x = x;
	}
	public void setKoordinataY(int y) {
		y = y;
	}
	public void setSirina(int width) {
		width = width;
	}
	public void setVisina(int height) {
		height = height;
	}
	public void setZdravlje(int health) {
		health = health;
	}
	public void setNapad(int damage) {
		damage = damage;
	}
	//Setteri
	
}


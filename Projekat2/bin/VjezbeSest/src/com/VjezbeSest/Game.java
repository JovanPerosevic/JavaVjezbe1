package com.VjezbeSest;

import java.util.ArrayList;

public class Game {
	public static void main(String[] arg) {
		
		Player igrac1 = new Player("Marko", 5, 6, 4, 6, 100);
		Enemy goblin1 = new Enemy("Goblin1", 8, 10, 30, 25, 50);
		
		String goblin2 = "Goblin;12,5;16x16;20";
		//S obzirom na nase trenutno nepoznavanje sintakse, mozemo reci logiku kod pozivanja drugog enemy-a
		//dakle, iz stringa goblin dva treba da cita stringove do preak karaktera koji su ";","," i "x"
		//onda ce te rijeci da se citaju u odredjeni niz, a iz tog niza ce da se pozovu clanovi niza u konstruktoru kako bi se napravio objekat goblin 2 iz datog stringa
		
		ArrayList <Enemy> neprijatelji = new ArrayList<>();
		
		neprijatelji.add(goblin1);
		
		System.out.print(goblin2);
		
		igrac1.toString();
	}

	//Metode koje su zadate u zadatku nismo odradili jer smo pokusali da rijesimo problem zasto nam se ne poziva novo ime po zadatim uslovima
	//Logiku za zadatak imamo, samo ne znamo sintaksu jer nismo doovljno vjezbali i ucili :)
}

//Marko Tomic 19/011
//Jovan Perosevic 24/047
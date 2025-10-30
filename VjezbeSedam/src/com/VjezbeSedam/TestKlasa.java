package com.VjezbeSedam;

public class TestKlasa {

	public static void main(String[] args) {
		Automobil auto = new Automobil("BMW", 2025, 2500, "Crna", 4, "dizel");
		Kamion kamion = new Kamion("MAN", 2008, 3000, "Crvena", 1000, true);
		Kombi kombi = new Kombi("FIAT", 2015, 1900, "Plava", 10);
		
		System.out.println(auto.toString());
		System.out.println(kamion.toString());
		System.out.println(kombi.toString());
		
		
		System.out.println("Cijena registracije automobila = " + auto.cijenaRegistracije());
		System.out.println("Cijena registracije kamiona = " +kamion.cijenaRegistracije());
		System.out.println("Cijena registracije kombija = " +kombi.cijenaRegistracije());

	}

}

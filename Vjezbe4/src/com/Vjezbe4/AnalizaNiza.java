package com.Vjezbe4;

public class AnalizaNiza {
	
	private int niz[];
	private int suma = 0;
	private double brojac = 0;
	
	public AnalizaNiza(int niz[]) {}
	
	public void nadjiParniPozitivniProsjek() {
		for (int i = 0 ; i < niz.length ; i ++) {
			if(niz[i]>0) {
				if(niz[i] % 2 == 0) {
					suma += niz[i];
					brojac += 1;
				}
			}
		}
		double ParniPozitivniProsjek = suma / brojac;
		System.out.printf("Parni pozitivni prosjek clanova niza je %.2f", ParniPozitivniProsjek);
	}
}

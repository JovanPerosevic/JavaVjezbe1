package com.Vjezbe4;
/* Napisati program koji korisniku omogucava unos duzine niza,
 * a zatim i elemente niza. Svaki element predstavlja broj brodova ostvarenih na ispitu. Nakon unosa
 * potrebno je odstampati prosjecni broj bodova i najmanji element u nizu (vrijednost i indeks)
 */

import java.util.Scanner;

public class UpisivanjeNiza {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite duzinu niza: ");
		int duzinaNiza = unos.nextInt();
		int [] niz = new int[duzinaNiza];
		int zbirElemenata = 0;
		double aritmetickaSredina;
		
		for (int i = 0 ; i < duzinaNiza ; i++) {
			System.out.print("Unesite " + i + ". element: ");
			niz[i] = unos.nextInt();
		}
		for (int i = 0 ; i < duzinaNiza ; i++) {
			zbirElemenata += niz[i];
		}
		
		aritmetickaSredina = (double) zbirElemenata / duzinaNiza;
		
		
		
		

	}

}

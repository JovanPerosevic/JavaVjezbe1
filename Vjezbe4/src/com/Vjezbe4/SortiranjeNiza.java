package com.Vjezbe4;

import java.util.Scanner;

public class SortiranjeNiza {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite duzinu niza: ");
		int N = unos.nextInt();
		
		int [] niz = new int [N];
		for (int i = 0 ; i < N ; i++) {
			System.out.print("Unesite " + (i + 1) +". clan niza: ");
			niz[i] = unos.nextInt();
		}
		
		for (int i = 0 ; i < N ; i++) {
			for (int j = i + 1 ; j < N ; j++) {
				if (niz[i] > niz[j]) {
					int a = niz[i];
					niz[i] = niz[j];
					niz[j] = a;
				}
			}
		}
		for (int i = 0 ; i < N ; i++) {
			System.out.print(niz[i] + " ");
		}
		
		System.out.print("\nUnesite broj koji zelite da provjerite da li postoji u nizu: ");
		
		int x = unos.nextInt();
		int indikator = 0;
		
		for (int i = 0 ; i < N ; i++) {
			if (x == niz[i]) {
				System.out.print("Broj "+ x + " postoji u nizu.");
				break;
			}
		}
		
		if (indikator == 0)
			System.out.print("\nNe postoji.");
		
		
		unos.close();
	}

}

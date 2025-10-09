package com.Vjezbe4;

import java.util.Scanner;

public class PosjeteFudbalskeUtakmice {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		int [] utakmica = new int[10];
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.print("Unesite broj posjeta " + (i + 1) +". dana: ");
			utakmica[i] = unos.nextInt();
		}
		
		int najvisePosjeta = utakmica[0];
		int dan = 0;
		
		for (int i = 1 ; i < 10 ; i++) {
			if(utakmica[i] > najvisePosjeta) {
				najvisePosjeta = utakmica[i];
				dan = i + 1;
			}
		}
		
		System.out.printf("Najvise posjeta je bilo %d. dana i stadion je posjetilo %d navijaca.", dan, najvisePosjeta);
		
		unos.close();

	}

}

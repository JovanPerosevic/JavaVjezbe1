package com.Vjezbe4;
/*/*Napisati program koji kreirra niz od 10 cijelih brojeva, 
 * popunjava ga brojevima od 1 do 10 a zatim ispisuje elemente niza u obrnutom redoslijedu*/
 
public class KreiranjeNiza {

	public static void main(String[] args) {
		
		int [] niz = new int[10];
		
		for(int i = 0 ; i < niz.length ; i++) {
			niz[i] = i + 1;
			System.out.println(i);
		}
		for (int i = niz.length - 1 ; i >= 0 ; i--) {
			System.out.println(niz[i]);
		}

	}

}

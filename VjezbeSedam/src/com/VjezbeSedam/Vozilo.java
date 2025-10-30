package com.VjezbeSedam;

public class Vozilo {
	//Atributi klase, s tim da sam dodao staticki podatak osnovne cijene registracije, jer su zajednicki podatak za svako vozilo
	private String proizvodjac;
	private int godinaProizvodnje;
	private int kubikaza;
	private String boja;
	static float osnovnaCijena = 100;
	private double KonacnaCijenaRegistracije;
	
	//Konstruktor klase vozilo
	public Vozilo(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja) {
		this.proizvodjac = proizvodjac;
		this.godinaProizvodnje = godinaProizvodnje;
		this.kubikaza = kubikaza;
		this.boja = boja;
	}

	//Geteri i seteri
	public String getProizvodjac() {return proizvodjac;}
	public void setProizvodjac(String proizvodjac) {this.proizvodjac = proizvodjac;}
	
	public int getGodinaProizvodnje() {return godinaProizvodnje;}
	public void setGodinaProizvodnje(int godinaProizvodnje) {this.godinaProizvodnje = godinaProizvodnje;}
	
	public int getKubikaza() {return kubikaza;}
	public void setKubikaza(int kubikaza) {this.kubikaza = kubikaza;}
	
	public String getBoja() {return boja;}
	public void setBoja(String boja) {this.boja = boja;}
	
	//Metoda koja racuna konacnu cijenu registracije
	public double izracunajCijenu(int godiste, int kubikaza){
		if(godiste < 2010) {
			KonacnaCijenaRegistracije = osnovnaCijena + 30;
			if(kubikaza > 2000)
				KonacnaCijenaRegistracije = KonacnaCijenaRegistracije + 50;
		}
		if(kubikaza > 2000)
			KonacnaCijenaRegistracije = osnovnaCijena + 50;
		if (KonacnaCijenaRegistracije == 0)
			return osnovnaCijena;
		return KonacnaCijenaRegistracije;
	}
	//Metoda koja vraca konacnu cijenu registracije
	public double getKonacnaCijena() {return KonacnaCijenaRegistracije;}


	@Override
	public String toString() {
		return " [proizvodjac=" + proizvodjac + ", godinaProizvodnje=" + godinaProizvodnje + ", kubikaza="
				+ kubikaza + ", boja=" + boja + "]";
	}
	

}

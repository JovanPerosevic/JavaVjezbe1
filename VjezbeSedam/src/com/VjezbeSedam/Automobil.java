package com.VjezbeSedam;

public class Automobil extends Vozilo{
	
	//Novi atributi klase automobil
	private int brojVrata;
	private String tipMotora;
	
	//Konstruktor za klasu automobil sa naslijedjenim atributima iz superklase vozilo + novi atributi
	public Automobil(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int brojVrata, String tipMotora) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		setBrojVrata(brojVrata);
		setTipMotora(tipMotora);
	}
	
	//Dodatni geteri i seteri
	public int getBrojVrata() {return brojVrata;}
	public void setBrojVrata(int brojVrata) {this.brojVrata = brojVrata;}

	public String getTipMotora() {return tipMotora;}
	public void setTipMotora(String tipMotora) {this.tipMotora = tipMotora;}
	
	//Naslijedjena je metoda iz superklase i ova je modifikovana
	public double cijenaRegistracije() {
		double cijena;
		cijena = super.izracunajCijenu(getGodinaProizvodnje(), getKubikaza());
		
		if (tipMotora.equalsIgnoreCase("dizel"))
			cijena = cijena + 20;
		return cijena;
	}

	@Override
	public String toString() {
		return "Automobil" + super.toString() + "[brojVrata=" + brojVrata + ", tipMotora=" + tipMotora + "]";
	}
	
	
}

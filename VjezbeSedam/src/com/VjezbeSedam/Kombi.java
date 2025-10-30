package com.VjezbeSedam;

public class Kombi extends Vozilo{
	
	private int kapacitetPutnika;

	public Kombi(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetPutnika) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		setKapacitetPutnika(kapacitetPutnika);
	}

	public int getKapacitetPutnika() {return kapacitetPutnika;}
	public void setKapacitetPutnika(int kapacitetPutnika) {this.kapacitetPutnika = kapacitetPutnika;}
	
	//Naslijedjena je metoda iz superklase i ova je modifikovana
	public double cijenaRegistracije() {
		double cijena;
		cijena = super.izracunajCijenu(getGodinaProizvodnje(), getKubikaza());
		
		if (kapacitetPutnika > 8)
			cijena = cijena + 30;
		return cijena;
	}

	@Override
	public String toString() {
		return "Kombi" + super.toString() + "[kapacitetPutnika=" + kapacitetPutnika + "]";
	}
	
	
}

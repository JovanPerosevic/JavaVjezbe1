package com.VjezbeSedam;

public class Kamion extends Vozilo{
	
	private int kapacitetTereta;
	private boolean prikolica;
	
	
	public Kamion(String proizvodjac, int godinaProizvodnje, int kubikaza, String boja, int kapacitetTereta, boolean status) {
		super(proizvodjac, godinaProizvodnje, kubikaza, boja);
		setKapacitetTereta(kapacitetTereta);
		setPrikolica(status);
	}

	public int getKapacitetTereta() {return kapacitetTereta;}
	public void setKapacitetTereta(int kapacitetTereta) {this.kapacitetTereta = kapacitetTereta;}

	public boolean isPrikolica() {return prikolica;}
	public void setPrikolica(boolean prikolica) {this.prikolica = prikolica;}
	
	//Naslijedjena je metoda iz superklase i ova je modifikovana
	public double cijenaRegistracije() {
		double cijena;
		cijena = super.izracunajCijenu(getGodinaProizvodnje(), getKubikaza());
		
		if (prikolica == true)
			cijena = cijena + 50;
		return cijena;
	}

	@Override
	public String toString() {
		return "Kamion" + super.toString() + "[kapacitetTereta=" + kapacitetTereta + ", prikolica=" + prikolica + "]";
	}
	
	
	
	
	

}

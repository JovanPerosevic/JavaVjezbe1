package com.VjezbeSest;

class Player {
	
	private String imeIgraca;
	private int pozicijaX;
	private int pozicijaY;
	private int width;
	private int height;
	private int health;
	private StringBuilder novoIme = new StringBuilder();
	
	//Kontruktor objekta Player
	public Player(String ime, int x, int y, int width, int height, int health) {
		this.imeIgraca = ime;
	//ne znam iz kojeg razloga nam ne vraca vrijednost novog imena kada u klasi game pozovemo metodu tu string, pa pretpostavljamo da postoji neka greska
		imeIgraca = imeIgraca.trim().replaceAll("\\s+", " ");
		
		String [] niz = imeIgraca.split(" ");
		
		for (String rijec : niz) {
			if (rijec.length() > 0) {
				this.novoIme.append( 
						Character.toUpperCase(rijec.charAt(0)));
				if(rijec.length() > 1)
					novoIme.append(rijec.substring(1, rijec.length()).toLowerCase());
			}
			
		}
		
		this.pozicijaX = x;
		this.pozicijaY = y;
		this.width = width;
		this.height = height;
		this.health = health;
	}

	public String getImeIgraca() {return imeIgraca;}
	public void setImeIgraca(String imeIgraca) {
		this.imeIgraca = imeIgraca;
		
		imeIgraca = imeIgraca.trim().replaceAll("\\s+", " ");
		
		String [] niz = imeIgraca.split(" ");
		
		for (String rijec : niz) {
			if (rijec.length() > 0) {
				this.novoIme.append( 
						Character.toUpperCase(rijec.charAt(0)));
				if(rijec.length() > 1)
					this.novoIme.append(rijec.substring(1).toLowerCase());
			}
			
		}
		}

	public int getPozicijaX() {return pozicijaX;}
	public void setPozicijaX(int pozicijaX) {this.pozicijaX = pozicijaX;}

	public int getPozicijaY() {return pozicijaY;}
	public void setPozicijaY(int pozicijaY) {this.pozicijaY = pozicijaY;}

	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}

	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}

	public int getHealth() {return health;}
	public void setHealth(int health) {
		if (health > 100)
			this.health = 100;
		else if(health<0)
			this.health = 0;
		else 
			this.health = health;
		}

	@Override
	public String toString() {
		return "Player [imeIgraca=" + novoIme + ", pozicijaX=" + pozicijaX + ", pozicijaY=" + pozicijaY + ", width="
				+ width + ", height=" + height + ", health=" + health + "]";
	}

	
	
	

}

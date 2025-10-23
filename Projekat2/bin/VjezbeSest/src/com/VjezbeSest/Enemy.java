package com.VjezbeSest;

class Enemy {
		
		private String imeNeprijatelja;
		private int pozicijaX;
		private int pozicijaY;
		private int width;
		private int height;
		private int damage;
		
		public Enemy(String ime, int x, int y, int width, int height, int damage) {
			this.imeNeprijatelja = ime;
			this.pozicijaX = x;
			this.pozicijaY = y;
			this.width = width;
			this.height = height;
			this.damage = damage;
		}

		public String getImeNeprijatelja() {return imeNeprijatelja;}
		public void setImeNeprijatelja(String imeNeprijatelja) {this.imeNeprijatelja = imeNeprijatelja;}

		public int getPozicijaX() {return pozicijaX;}
		public void setPozicijaX(int pozicijaX) {this.pozicijaX = pozicijaX;}

		public int getPozicijaY() {return pozicijaY;}
		public void setPozicijaY(int pozicijaY) {this.pozicijaY = pozicijaY;}

		public int getWidth() {return width;}
		public void setWidth(int width) {this.width = width;}

		public int getHeight() {return height;}
		public void setHeight(int height) {this.height = height;}

		public int getDamage() {return damage;}
		public void setDamage(int damage) {
			if (damage > 100)
				this.damage = 100;
			else if(damage < 0)
				this.damage = 0;
			else 
				this.damage = damage;
			}

		@Override
		public String toString() {
			return "Enemy [ime eprijatelja=" + imeNeprijatelja + ", pozicija X=" + pozicijaX + ", pozicija Y=" + pozicijaY
					+ ", sirina=" + width + ", visina=" + height + ", damage=" + damage + "]";
		}
		
		


}

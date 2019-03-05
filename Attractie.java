
abstract class Attractie {
	private String naam;
	private double prijs;
	private int oppervlakte;
	private double omzet;
	private int aantalKaartjes;
	
		public Attractie(String naam, double prijs, int oppervlakte){
			this.naam =naam;
			this.prijs =prijs;
			this.oppervlakte=oppervlakte;
			this.omzet=0;
			this.aantalKaartjes=0;
		}//end constructor
	
	void draaien(Attractie attractie) {
		System.out.println("De attractie " + attractie.naam + " draait!");
		System.out.println("");
	}//end methode draaien
	
	public void setName(String name) {
		naam = name;
	}//end setName
	public double getMoney() {
		return omzet;
	}//end GetMoney
}//end class Attractie

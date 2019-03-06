
abstract class Attractie {
	private String naam;
	private int prijs;
	private int oppervlakte;
	private int omzet;
	private int aantalKaartjes;

	public Attractie(String naam, int prijs, int oppervlakte) {
		this.naam = naam;
		this.prijs = prijs;
		this.oppervlakte = oppervlakte;
		this.omzet = 0;
		this.aantalKaartjes = 0;
	}// end constructor

	void draaien() {
		System.out.println("De attractie " + this.naam + " draait!");
		System.out.println("");
		this.aantalKaartjes++;
		this.omzet += this.prijs;
	}// end methode draaien

	public int getAantalKaartjes() {
		return aantalKaartjes;
	}// end setName

	public int getMoney() {
		return omzet;
	}// end GetMoney
}// end class Attractie

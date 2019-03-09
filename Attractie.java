
abstract class Attractie {
	private String naam;
	private int prijs; // in cent
	private int oppervlakte;
	private int omzet; // in cent
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
		Kermis.hoofdKassa.setTotaalMoney(this.getPrijs());
		Kermis.hoofdKassa.setTotaalAantalKaartjes();
	}// end methode draaien

	public int getAantalKaartjes() {
		return aantalKaartjes;
	}// end setName

	public int getPrijs() {
		return prijs;
	}// end getPrijs

	public String getNaam() {
		return naam;
	}// end getNaam

	public int getMoney() {
		return omzet;
	}// end GetMoney

	public void setMoney(int money) {
		this.omzet += money;
	}// end setMoney
}// end class Attractie

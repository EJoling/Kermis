class LadderKlimmen extends Attractie implements GokAttractie {
	private int belasting;
	private int totaalBelasting;
	private int aantalBelastbareKaartjes;
	private int aantalNietBelastbareKaartjes;
	
	
	public LadderKlimmen() {
		super("LadderKlimmen", 500, 10);
	}// end constructor

	public int getBelasting() {
		return belasting;
	}// end getBelasting

	public void setBelasting(int omzet) {
		belasting = (omzet * 30 / 100);
	}// end setBelasting
	
	public int getTotaalBelasting() {
		return totaalBelasting;
	}// end getBelasting

	public void setTotaalBelasting(int moneys) {
		totaalBelasting += moneys;
	}// end setBelasting

	public int getAantalBelastbareKaartjes() {
		return aantalBelastbareKaartjes;
	}// end getBelasting

	public void resetAantalBelastbareKaartjes(int aantal) {
		aantalBelastbareKaartjes = aantal;
	}// end setBelasting

	public int getaantalNietBelastbareKaartjes() {
		return aantalNietBelastbareKaartjes;
	}// end getBelasting

	public void resetaantalNietBelastbareKaartjes(int aantal) {
		aantalNietBelastbareKaartjes = aantal;
	}// end setBelasting

	public int kansSpelBelastingBetalen(int money) {
		if (this.getAantalKaartjes() > 0) {
			aantalBelastbareKaartjes = this.getAantalKaartjes() - this.aantalNietBelastbareKaartjes;
			System.out.println(
					"Aantal kaartjes verkocht waarover nog belasting betaald moet worden. " + aantalBelastbareKaartjes);
			setBelasting(aantalBelastbareKaartjes * this.getPrijs());
			setTotaalBelasting(getBelasting());
//				System.out.println("kansSpelBelastingBetalen in LadderKlimmen :" + getBelasting());
			setMoney(-getBelasting());
			Kermis.hoofdKassa.setTotaalMoney(-getBelasting());
//				System.out.println("Moneys omzet in ladderklimmen " + getMoney());
			resetaantalNietBelastbareKaartjes(this.getAantalKaartjes());
			resetAantalBelastbareKaartjes(0);
			return getBelasting();
		} // end outer if
		else {
			System.out.println("Er zijn nog geen kaartjes verkocht voor " + this.getNaam());
			return 0;
		} // end else
	}// end kansSpelBelastingBetalen

}// end class LadderKlimmen

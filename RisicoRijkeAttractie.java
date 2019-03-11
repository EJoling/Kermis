abstract class RisicoRijkeAttractie extends Attractie {

	int draailimiet;
	boolean inBedrijf;
	int aantalKeuringen;

	public RisicoRijkeAttractie(String naam, int prijs, int oppervlakte, int draailimiet) {
		super(naam, prijs, oppervlakte);
		this.draailimiet = draailimiet;
	}// end constructor

	abstract boolean opstellingsKeuring();

	abstract void onderhoudsbeurt();

	// overrides Attractie.draaien(). Als RisicoRijkeAttractie inBedrijf is:
	// draaien. Als inBedrijf = false:
	void draaien() {
		if (this.getAantalKaartjes() == 0) {
			opstellingsKeuring();
			System.err.println("Voor de attractie " + getNaam()
					+ " was eerst een opstellingskeuring nodig. Bedankt voor het wachten!");
		} // end if

		if (inBedrijf == true) {
			super.draaien();
		} // end if

		try {
			if ((getAantalKaartjes() % draailimiet) == 0) {
				inBedrijf = false;
				throw new OnderhoudsException();
			} // end inner if
		} // end try
		catch (OnderhoudsException e) {
			System.err.println(e.getMessage());
			onderhoudsbeurt();
		} // end catch
//		} // end if

	}// end methode draaien

}// end class RisicoRijkeAttractie

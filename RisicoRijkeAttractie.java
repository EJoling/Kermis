abstract class RisicoRijkeAttractie extends Attractie {

	int draailimiet;
	boolean inBedrijf;
	int aantalKeuringen;

	public RisicoRijkeAttractie(String naam, int prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);

	}// end constructor

	abstract boolean opstellingsKeuring();


	// overrides Attractie.draaien()
	void draaien() {
		if(inBedrijf == true){
				super.draaien();
			} // end if
		
		if (inBedrijf == true && (getAantalKaartjes()%draailimiet) == 0) {
			inBedrijf = false;
			}//end if
		else if (inBedrijf == false) {
			System.out.println("De attractie " + getNaam()
					+ " moet eerst een opstellingskeuring krijgen. Kom later terug.");
			opstellingsKeuring();

			} // end outer if

	}// end methode draaien

}// end class RisicoRijkeAttractie

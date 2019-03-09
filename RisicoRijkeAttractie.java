abstract class RisicoRijkeAttractie extends Attractie {

	int draailimiet;
	boolean inBedrijf;
	int aantalKeuringen;

	public RisicoRijkeAttractie(String naam, int prijs, int oppervlakte) {
		super(naam, prijs, oppervlakte);

	}// end constructor

	abstract boolean opstellingsKeuring();
	
	abstract void onderhoudsbeurt();

	// overrides Attractie.draaien()
	void draaien() {
		if(inBedrijf == true){
				super.draaien();
			} // end if
		try {
			if (inBedrijf == true && (getAantalKaartjes()%draailimiet) == 0) {
				inBedrijf = false;
				throw new OnderhoudsException ();
				}//end if
		}catch (OnderhoudsException e) {
			System.err.println(e.getMessage());
			onderhoudsbeurt();
		}//end catch
			
		if (this.getAantalKaartjes()==0) {
			System.out.println("De attractie " + getNaam()
					+ " moet eerst een opstellingskeuring krijgen. Kom later terug.");
			opstellingsKeuring();
			System.out.println();
			} // end outer if

	}// end methode draaien

}// end class RisicoRijkeAttractie

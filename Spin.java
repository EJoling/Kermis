class Spin extends RisicoRijkeAttractie {

	public Spin() {
		super("Spin", 225, 30);
		draailimiet = 5;

	}// end constructor

	boolean opstellingsKeuring() {
		inBedrijf = true;
		aantalKeuringen++;
		return inBedrijf;
	}// end opstellingsKeuring
}// end class Spin
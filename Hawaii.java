class Hawaii extends RisicoRijkeAttractie {

	public Hawaii() {
		super("Hawaii", 290, 50);
		draailimiet = 10;
	}// end constructor

	boolean opstellingsKeuring() {
		inBedrijf = true;
		aantalKeuringen++;
		return inBedrijf;
	}// end opstellingsKeuring

}// end class Hawaii
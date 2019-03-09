
public class Kassa {
	private int omzetTotaal;
	private int aantalKaartjesTotaal;
	private int opgegevenBelasting;
	private int totaalBelasting;
	private int aantalBelastingOpgaven;

	public void setTotaalAantalKaartjes() {
		aantalKaartjesTotaal++;
	}// end setAantalKaartjes

	public int getTotaalAantalKaartjes() {
		return aantalKaartjesTotaal;
	}// end getAantalKaartjes

	public void setTotaalMoney(int money) {
		this.omzetTotaal += money;
	}// end setMoney

	public int getTotaalMoney() {
		return this.omzetTotaal;
	}// end getMoney

	public void setOpgegevenBelasting(int belasting) {
		opgegevenBelasting += belasting;
	}// end setMoney

	public int getOpgegevenBelasting() {
		return opgegevenBelasting;
	}// end getMoney

	public void setTotaalBelasting(int money) {
		this.totaalBelasting += money;
	}// end setMoney

	public int getTotaalBelasting() {
		return this.totaalBelasting;
	}// end getMoney

	public void setaantalBelastingOpgaven() {
		aantalBelastingOpgaven++;
	}// end setMoney

	public int getaantalBelastingOpgaven() {
		return aantalBelastingOpgaven;
	}// end getMoney

	// Belasting van GokAttracties uit omzet apart houden
	public void belastingOpgave(Attractie attractie) {
		System.out.println("instance of GokAttractie????");
		if (attractie instanceof GokAttractie) {
			System.out.println(attractie.getNaam() + "inderdaad instance of GokAttractie");
			this.opgegevenBelasting += ((GokAttractie) attractie).kansSpelBelastingBetalen(attractie.getMoney());
			
		} // end if
		System.out.println("Kassa opgegeven belasting: " + getOpgegevenBelasting());
	}// end methode belastingOpgave

	// Printen van omzet, kaartjes of totale belasting
	static void overzichtPrinten(String type) throws Exception {
		if (type == "omzet") {
			System.out.println("Dit is de omzet tot nu toe van de Kermis:");

			for (int i = 0; i < Kermis.attList.size(); i++) {
				System.out.printf("%-40s%-6.2f\n", Kermis.attList.get(i).getNaam(),
						(double) Kermis.attList.get(i).getMoney() / 100);
			} // end for
			System.out.println();
			System.out.printf("%-40s%-6.2f\n", "Totale Omzet", (double) Kermis.hoofdKassa.getTotaalMoney() / 100);
			System.out.println();
		} // end if
		else if (type == "aantalKaartjes") {
			System.out.println("Dit zijn de verkochte kaartjes tot nu toe van de Kermis:");

			for (int i = 0; i < Kermis.attList.size(); i++) {
				System.out.printf("%-40s%-6d\n", Kermis.attList.get(i).getNaam(),
						Kermis.attList.get(i).getAantalKaartjes());
			} // end for
			System.out.println();
			System.out.printf("%-40s%-6d\n", "Totaal aantal kaartjes", Kermis.hoofdKassa.getTotaalAantalKaartjes());
			System.out.println();
		} // end if
		else if (type == "belasting") {
			System.out.println("Dit is de afgedragen belasting tot nu toe van de Kermis:");
			for (Attractie attractie : Kermis.attList) {
				if (attractie instanceof GokAttractie) {
					System.out.println();
					System.out.printf("%-40s%-10.2f\n",
							 attractie.getNaam() + " dit bezoek",
							(double) ((GokAttractie) attractie).getBelasting() / 100);
					System.out.printf("%-40s%-10.2f\n",
							 attractie.getNaam() + " totaal",
							(double) ((GokAttractie) attractie).getTotaalBelasting() / 100);
					System.out.println();
				} // end if
			} // end for
			System.out.println();
			System.out.printf("%-40s%-10d\n", "Aantal bezoeken belastinginspecteur",
					Kermis.hoofdKassa.aantalBelastingOpgaven);
			System.out.printf("%-40s%-10.2f\n", "Totaal afgedragen belasting",
					(double) Kermis.hoofdKassa.getTotaalBelasting() / 100);
			System.out.println();
		} // end else if
		else {
			throw new Exception("Ongeldige invoer in argument overzichtPrinten()");
		} // end else
	}// end overzichtPrinten
}// end class Kassa
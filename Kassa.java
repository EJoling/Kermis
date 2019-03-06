
public class Kassa{
	private int omzet;
	private int aantalKaartjes;

	public void setAantalKaartjes() {
		aantalKaartjes ++;			
	}// end setAantalKaartjes

	public int getAantalKaartjes() {
		return aantalKaartjes;
	}// end getAantalKaartjes

	public void setMoney(int attractiePrijs) {
		omzet += attractiePrijs;
	}// end setMoney

	public int getMoney() {
		return omzet;
	}// end getMoney

	static void overzichtPrinten(String type) throws Exception{
		if (type == "omzet") {
			System.out.println("Dit is de omzet tot nu toe van de Kermis:");

			for (int i = 0; i < Kermis.attList.size(); i++) {
				System.out.printf("%-40s%-6.2f\n", Kermis.attList.get(i).getNaam(),
						(double) Kermis.attList.get(i).getMoney() / 100);
			} // end for
			System.out.println();
			System.out.printf("%-40s%-6.2f\n", "Totale Omzet", (double) Kermis.hoofdKassa.getMoney() / 100);
			System.out.println();
		} // end if
		else if (type == "aantalKaartjes") {
			System.out.println("Dit zijn de verkochte kaartjes tot nu toe van de Kermis:");

			for (int i = 0; i < Kermis.attList.size(); i++) {
				System.out.printf("%-40s%-6d\n", Kermis.attList.get(i).getNaam(),
						Kermis.attList.get(i).getAantalKaartjes());
			} // end for
			System.out.println();
			System.out.printf("%-40s%-6d\n", "Totaal aantal kaartjes", Kermis.hoofdKassa.getAantalKaartjes());
			System.out.println();
		} // end if
		else{
			throw new Exception("Ongeldige invoer in argument overzichtPrinten()");
		}
	}// end overzichtPrinten
}// end class Kassa
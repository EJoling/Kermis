
public class Kassa {
	private int omzet;
	private int aantalKaartjes;

	public void setAantalKaartjes(int aantal) {
		aantalKaartjes += aantal;
	}// end getAantalKaartjes

	public int getAantalKaartjes() {
		return aantalKaartjes;
	}// end getAantalKaartjes

	public void setMoney(int attractieOmzet) {
		omzet += attractieOmzet;
	}// end getMoney

	public int getMoney() {
		return omzet;
	}// end getMoney
}// end class Kassa
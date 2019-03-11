import java.time.LocalDateTime;
import java.util.Scanner;

class Spin extends RisicoRijkeAttractie implements GokAttractie {
	private int belasting;
	private int totaalBelasting;
	private int aantalBelastbareKaartjes;
	private int aantalNietBelastbareKaartjes;

	public Spin() {
		super("Spin", 225, 30,5);

	}// end constructor

	boolean opstellingsKeuring() {
		this.inBedrijf = true;
		this.aantalKeuringen++;
		LocalDateTime van = LocalDateTime.now();
		LocalDateTime tot = van.plusSeconds(2);
//		van.equals(tot);
		while (van.isBefore(tot)) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("\t\t\t\t KEURING");
			van = LocalDateTime.now();
		} // end while
		return this.inBedrijf;
	}// end opstellingsKeuring

	void onderhoudsbeurt() {
		Prompter.monteur(this.getNaam());
		boolean attractieStuk = true;
		while (attractieStuk == true) {
			Scanner scannertje = new Scanner(System.in);
			String keuzeMonteur = scannertje.nextLine();

			switch (keuzeMonteur) {
			case "m":
				LocalDateTime van = LocalDateTime.now();
				LocalDateTime tot = van.withSecond(van.getSecond() + 1);
				van.equals(tot);
				while (!van.equals(tot)) {
					System.out.println("o");
					System.out.println("");
					System.out.println("");
					System.out.println("o");
					System.out.println("");
					System.out.println("");
					System.out.println("o");
					System.out.println("");
					System.out.println("");
					System.out.println("o");
					System.out.println("");
					System.out.println("");
					System.out.println("o");
					System.out.println("");
					System.out.println("");
					System.out.println("o");
					System.out.println("");
					System.out.println("");
					System.out.println("o");
					van = LocalDateTime.now();
				} // end while
				System.out.println("Monteur Hans heeft de " + getNaam() + " gefixt, dus je kan er nu weer in!");
				this.inBedrijf = true;
				attractieStuk = false;
				break;
			case "n":
				System.out.println("Ok, jammer.");
				this.inBedrijf = false;
				attractieStuk = false;
				break;
			default:
				System.out.println("Geen correcte invoer.");
			}// end switch
		} // end while
	}// end methode onderhoudsbeurt

	public int kansSpelBelastingBetalen(int money) {
		if (this.getAantalKaartjes() > 0) {
			aantalBelastbareKaartjes = this.getAantalKaartjes() - this.aantalNietBelastbareKaartjes;
			System.out.println(
					"Aantal kaartjes verkocht waarover nog belasting betaald moet worden. " + aantalBelastbareKaartjes);
			setBelasting(aantalBelastbareKaartjes * this.getPrijs());
			setTotaalBelasting(getBelasting());
//			System.out.println("kansSpelBelastingBetalen in LadderKlimmen :" + getBelasting());
			setMoney(-getBelasting());
			Kermis.hoofdKassa.setTotaalMoney(-getBelasting());
//			System.out.println("Moneys omzet in ladderklimmen " + getMoney());
			resetaantalNietBelastbareKaartjes(this.getAantalKaartjes());
			resetAantalBelastbareKaartjes(0);
			return getBelasting();
		} // end outer if
		else {
			System.out.println("Er zijn nog geen kaartjes verkocht voor " + this.getNaam());
			return 0;
		} // end else
	}// end kansSpelBelastingBetalen

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

}// end class Spin
import java.time.LocalDateTime;
import java.util.Scanner;

class Hawaii extends RisicoRijkeAttractie {

	public Hawaii() {
		super("Hawaii", 290, 50, 10);
	}// end constructor

	boolean opstellingsKeuring() {
		this.inBedrijf = true;
		this.aantalKeuringen++;
		LocalDateTime van = LocalDateTime.now();
		LocalDateTime tot = van.withSecond(van.getSecond() + 2);
		van.equals(tot);
		while (!van.equals(tot)) {
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

}// end class Hawaii
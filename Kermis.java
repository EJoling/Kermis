import java.util.ArrayList;
import java.util.Scanner;

public class Kermis {
	public static void main(String[] args) {
		Prompter prompter = new Prompter();
		ArrayList<Attractie> attList = new ArrayList<>();

		attList.add(new Botsauto());
		attList.add(new Spin());
		attList.add(new Spiegelpaleis());
		attList.add(new Spookhuis());
		attList.add(new Hawaii());
		attList.add(new LadderKlimmen());

		prompter.welkom();

		while (true) {
			prompter.keuzeAttractieBericht();
			Scanner scanner = new Scanner(System.in);
			String keuzeAtt = scanner.nextLine();

			int keuzeAttIndex = 0;

			switch (keuzeAtt) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
				keuzeAttIndex = Integer.parseInt(keuzeAtt);
				break;
			default:
				System.out.println("Dit is geen keuzemogelijkheid");
			}// end switch

			if (keuzeAttIndex > 0 && keuzeAttIndex < 7) {
				attList.get((keuzeAttIndex - 1)).draaien();
			} // end if
		} // end while
	}// end main

}// end class Kermis

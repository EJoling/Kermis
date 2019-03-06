import java.util.ArrayList;
import java.util.Scanner;

public class Kermis {
	static ArrayList<Attractie> attList = new ArrayList<>();
	static Prompter prompter = new Prompter();
	static Kassa hoofdKassa = new Kassa();
	
	public static void main(String[] args) {
		
		

		// alle attracties aanmaken en wegzetten
		//ArrayList<Attractie> attList = new ArrayList<>();
		attList.add(new Botsauto());
		attList.add(new Spin());
		attList.add(new Spiegelpaleis());
		attList.add(new Spookhuis());
		attList.add(new Hawaii());
		attList.add(new LadderKlimmen());

		prompter.welkom();

		// keuzeoptie geven
		while (true) {
			prompter.keuzeAttractieBericht();
			Scanner scanner = new Scanner(System.in);
			String keuzeAtt = scanner.nextLine();
			
			
			int keuzeAttIndex = 0;
			
			switch (keuzeAtt) {
			case "o":
				try {
				hoofdKassa.overzichtPrinten("omzet");
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}//end catch
				break;
			case "k":
				try {
				hoofdKassa.overzichtPrinten("aantalKaartjes");
				} catch (Exception e) {
				System.err.println(e.getMessage());
				}//end catch
				break;
				
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

			// als de keuze valide is, dan draait de specifieke attractie.
			// zowel de attractie (in de methode draaien) als de hoofdKassa krijgen er omzet
			// en aantalKaartjes bij
			if (keuzeAttIndex > 0 && keuzeAttIndex < 7) {
				attList.get((keuzeAttIndex - 1)).draaien();				
			} // end if

		} // end while
	
	}// end main

}// end class Kermis










import java.util.HashMap;
import java.util.Scanner;
public class Kermis {
	public static void main(String [] args) {
		
		Attractie bots = new Botsauto();
		Attractie spin = new Spin();
		Attractie spiegel = new Spiegelpaleis();
		Attractie spook = new Spookhuis();
		Attractie haw = new Hawaii();
		Attractie lk = new LadderKlimmen();
		
		while(true) {
		System.out.println("We zijn op de Kermis! Welke attractie wil je in?\n"
				+ "Voer een keuze voor een attractie in: \n"
				+ "[1] Botsauto\t[2] Spin\t[3] Spiegelpaleis\t[4] Spookhuis\t[5] Hawaii\t[6] Ladderklimmen");
		Scanner scanner = new Scanner(System.in);
		String attractiekeuze = scanner.nextLine();
		
	 
		switch(attractiekeuze) {
		case "1": bots.draaien(bots);
		break;
		case "2": spin.draaien(spin);
		break;
		case "3": spiegel.draaien(spiegel);
		break;
		case "4": spook.draaien(spook);
		break;
		case "5": haw.draaien(haw);
		break;
		case "6": lk.draaien(lk);
		break;
		default: System.out.println("Niet goed");
		}//end switch
		
		}//end while
	}//end main
	
}//end class Kermis

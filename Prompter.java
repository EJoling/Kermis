// print teksten uit, maakt de rest van de code wat strakker

class Prompter {

	static void welkom() {
		System.out.println("Welkom op de kermis! We hebben allemaal mooie attracties.");

	}// end welkom()

	static void keuzeAttractieBericht() {
		System.out.println("Voer een keuze voor een attractie in: \n"
				+ "[1] Botsauto\t[2] Spin\t[3] Spiegelpaleis\t[4] Spookhuis\t[5] Hawaii\t[6] Ladderklimmen");
		System.out.println("[b] BelastingInspecteur \t[o] Omzet\t \t[k] Aantal kaartjes\t ");
	}// end keuzeAttractie

	static void belastingInspecteur() {
		System.out.println("De GokSpelBelasting moet betaald worden.");
	}// end belastingInspecteur()

	static void monteur (String naam) {
		System.out.println(naam + " rammelde een beetje. Wil je een monteur laten komen door op [m] te drukken?");
		System.out.println("Je kan het ook niet doen door op [n] te drukken, maar dan doet de attractie " +naam+ " het ook niet.");
	}
	
}// end class Prompter

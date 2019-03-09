
public interface GokAttractie {

	public int kansSpelBelastingBetalen(int money);

	public int getBelasting();

	public void setBelasting(int money);
	
	public int getTotaalBelasting();
	
	public void setTotaalBelasting(int moneys);

	public int getAantalBelastbareKaartjes();
	
	public void resetAantalBelastbareKaartjes(int aantal);
	
	public int getaantalNietBelastbareKaartjes();

	public void resetaantalNietBelastbareKaartjes(int aantal);

}// end interface

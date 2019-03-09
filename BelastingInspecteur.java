
public class BelastingInspecteur {
	private int betaaldeBelasting;

	public void belastingInnen(Kassa kassa) {
		setbetaaldeBelasting(kassa.getOpgegevenBelasting());
		kassa.setaantalBelastingOpgaven();
		kassa.setTotaalBelasting(kassa.getOpgegevenBelasting());
		kassa.setOpgegevenBelasting(-kassa.getOpgegevenBelasting());
	}// end methode belastingInnen

	void setbetaaldeBelasting(int money) {
		this.betaaldeBelasting += money;
	}// end setbetaaldeBelasting

	int getbetaaldeBelasting() {
		return betaaldeBelasting;
	}// end getbetaaldeBelasting

}// end class

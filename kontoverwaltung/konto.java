
public class konto {
	private String kontoinhaber;
	private int kontostand;

	public void setInhaber(String inhaber) {
		
		kontoinhaber = inhaber;
		kontostand = 0;
		
		//System.out.println(inhaber);
		//System.out.println(kontostand);
	}
	
	public void aufbuchen(int betrag) {
	
		kontostand = kontostand + betrag;
	}
	
	public void abbuchen(int betrag) {
		
		if(betrag > kontostand)
		{
		System.out.println("Die Buchung kann nicht durchgef�hrt werden! Betrag h�her als Kontostand!");
		}
		else
		{
		kontostand = kontostand - betrag;
		System.out.println(kontostand);
		}
	}
}


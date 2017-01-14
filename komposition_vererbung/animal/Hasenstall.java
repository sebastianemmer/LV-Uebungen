package animal;

public class Hasenstall {

	public static void main(String[] args) {
		
		Hase hase1 = new Hase("Hans");
		Weihnachtshase whase1 = new Weihnachtshase("Max");
		Osterhase ohase1 = new Osterhase("Susi");
		
		hase1.fressen();
		whase1.geschenke_verteilen();
		ohase1.ostereier_verstecken();
		whase1.schlafen();
		ohase1.schlafen();
	}

}

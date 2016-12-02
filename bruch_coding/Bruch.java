
public class Bruch {

	int zaehler;
	int nenner;

	public Bruch(int zaehler, int nenner) {
		this.nenner = nenner;
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public int getZaehler() {
		return zaehler;
	}

	//public double toDecimal() {
	//}
	
	public void print() {
		System.out.println(zaehler + "/" + nenner);
	}

	public Bruch multiplicate(Bruch b2) {
		int zaehler = this.zaehler * b2.getZaehler();
		int nenner = this.nenner * b2.getNenner();
		
		return new Bruch (zaehler, nenner);
	}
}

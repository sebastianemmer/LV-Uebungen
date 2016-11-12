
public class uebung05_teilerFinden {

	public static void main(String[] args) {
		
		int zahl = 11;
		int teiler = 2;
		
		while (teiler < zahl) {
			
			if (zahl%teiler == 0) {
				System.out.println("Teiler: "+teiler+" gefunden!");
			}
			
			teiler++;
		}

	}

}

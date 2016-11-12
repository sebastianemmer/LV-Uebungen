
public class uebung_Metropolis {

	public static void main(String[] args) {
		boolean ergebnis = isMetropolis(true, 101_000, 100);
		
//		System.out.println("Ergebnis: "+ergebnis);
		
		if (ergebnis) {
			System.out.println("Die Metropole ist Cool.");
		}
		else {
			System.out.println("Vorstadtprovinz!");
		}
	}
	
	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {
		
		double taxes = inhabitants * taxPerPersonAndMonth * 12;
		
		if ((isCapital && inhabitants > 100_000) || (inhabitants > 200_000 && taxes > 720_000_000))
		{
			return true;
		}
		else
		{
			return false;	
		
//		boolean resultA = isCapital && inhabitants > 100_000;
//		boolean resultB = taxes > 720_000_000 && inhabitants > 200_000;
//		
//		return resultA || resultB;
		}
	}
}

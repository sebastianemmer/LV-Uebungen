
public class uebung10_arrayDemo1 {

	public static void main(String[] args) {
		int[] punkte1 = new int[3];

		punkte1[0] = 3;
		punkte1[1] = 4;
		punkte1[2] = 5;

		int[] punkte2 = { 7, 1, 3 };

		System.out.println(
				"+  " + (punkte1[0] + punkte2[0]) + "," + (punkte1[1] + punkte2[1]) + "," + (punkte1[2] + punkte2[2]));
		System.out.println(
				"*  " + (punkte1[0] * punkte2[0]) + "," + (punkte1[1] * punkte2[1]) + "," + (punkte1[2] * punkte2[2]));

		int anzahlPunkteArray1 = punkte1.length;

		System.out.println();
		System.out.println(anzahlPunkteArray1);
	}

}


public class uebung11_arrayDemo2 {

	public static void main(String[] args) {
		String[] monate = {"Jänner","Februar","März","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};

		int anzahlMonate = monate.length;
		
		for(int i=0; i<anzahlMonate; i++) {
			System.out.println(monate[i] + " [" + (i+1) + "]");
		}
		
		
		int[][] a = {{1,2,3},{4,5,6}};
		
//		int b,c;
//		b = a[0][0];
//		c= a[1][2];
		
		System.out.println();
		System.out.println(a[0][0] + ", " + a[1][2]);
		}
	}

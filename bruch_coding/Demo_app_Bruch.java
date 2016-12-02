
public class Demo_app_Bruch {

	public static void main(String[] args) {
		Bruch b1 = new Bruch(7, 5);
		Bruch b2 = new Bruch(3, 4);

		//System.out.println(b1.toDecimal());
		//b2.toDecimal();
		System.out.println();
		b1.print();
		b2.print();
		
		Bruch b3 = b1.multiplicate(b2);
		System.out.println("Lösung: " + b3);

	}

}

package uebung;

public class Customer extends Person {
	int id;
	
	public Customer(String firstname, String ln, int id) {

		super(firstname, ln);
		/*
		setFirstname(firstname);	] -> Diese beiden Zeilen werden
		setLastname(ln);			] -> nun durch "super" ersetzt.
		*/
		this.id = id;
	}

	public void getInfo() {
		System.out.println("This is a Customer!");
	}
}


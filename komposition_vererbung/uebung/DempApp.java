
package uebung;

public class DempApp {

	public static void main(String[] args) {

		Customer customer = new Customer("Susi", "Sorglos", 76);
		PremiumCustomer pcust = new PremiumCustomer("Manuel", "Maier", 10);
		
		// System.out.println(customer.getFirstname() + " " + customer.getLastname() + " " + customer.id);
		
		// System.out.println(customer.getFirstname());
		// System.out.println(customer.getLastname());
		
		Person p = new Person("john", "Doe");

		p.getInfo();
		customer.getInfo();
		pcust.getInfo();
	}

}

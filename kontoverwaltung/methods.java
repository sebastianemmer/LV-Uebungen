
public class methods {

	public static void main(String[] args) {
		konto konto1 = new konto();
		
		konto1.setInhaber("Max Maier");
		
		konto1.aufbuchen(50);
		konto1.abbuchen(5);
	}
}
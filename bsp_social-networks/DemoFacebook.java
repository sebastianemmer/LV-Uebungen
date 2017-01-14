
public class DemoFacebook {

	public static void main(String[] args) {
		MayBeInt alter = new MayBeInt(25, 1);
		MayBeInt gehalt = new MayBeInt(2500, 2);
		MayBe<String> wohnort = new MayBe<String>("Liezen", 1);
		
		Profil p1 = new Profil("Hans", "Maier", "h.maier@gmx.at", "vergeben", alter, gehalt, wohnort);
		
		p1.print();
	}

}

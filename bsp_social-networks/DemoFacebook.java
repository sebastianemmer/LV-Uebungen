
public class DemoFacebook {

	public static void main(String[] args) {
		MayBeInt alter = new MayBeInt(25, 1);
		MayBeInt gehalt = new MayBeInt(2500, 2);
		
		Profil p1 = new Profil("Hans", "Maier", "h.maier@gmx.at", "vergeben", alter, gehalt);
		
		p1.print();
	}

}

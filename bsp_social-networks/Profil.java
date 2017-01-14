
public class Profil {
			
		private String vorname;
		private String nachname;
		private String email;
		private String bezStatus;
		private MayBeInt alter;
		private MayBeInt gehalt;
		private MayBe<String> wohnort;
		
		public Profil (String vorname, String nachname,
				String email, String bezStatus,
				MayBeInt alter, MayBeInt gehalt,
				MayBe<String> wohnort) {
			
			super();
			this.vorname = vorname;
			this.nachname = nachname;
			this.email = email;
			this.bezStatus = bezStatus;
			this.alter = alter;
			this.gehalt = gehalt;
			this.wohnort = wohnort;
			
		}
			
		public void print() {
			System.out.println(vorname + " " + nachname);
			System.out.print("Alter - ");
			alter.print();
			System.out.print("Gehalt - ");
			gehalt.print();
			System.out.print("Herkunft - ");
			wohnort.print();
		}
}

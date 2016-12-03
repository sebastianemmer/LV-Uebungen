
public class Profil {
			
		private String vorname;
		private String nachname;
		private String email;
		private String bezStatus;
		private MayBeInt alter;
		private MayBeInt gehalt;
		
		public Profil (String vorname, String nachname,
				String email, String bezStatus,
				MayBeInt alter, MayBeInt gehalt) {
			
			super();
			this.vorname = vorname;
			this.nachname = nachname;
			this.email = email;
			this.bezStatus = bezStatus;
			this.alter = alter;
			this.gehalt = gehalt;
			
		}
			
		public void print() {
			System.out.println(vorname + " " + nachname);
			alter.print();
			gehalt.print();
		}
}

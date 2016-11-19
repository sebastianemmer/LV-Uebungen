
public class class_ausgabe {

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.Adresse = new Adresse();
		person2.Adresse = new Adresse();
		
		person1.vorname = "Hans";
		person1.nachname = "Mueller";
		person1.alter = 20;
		person1.Adresse.strasse = "Hauptplatz";
		person1.Adresse.hausnr = 5;
		person1.Adresse.plz = 8940;
		person1.Adresse.ort = "Liezen";
		
		person2.vorname = "Max";
		person2.nachname = "Mustermann";
		person2.alter = 39;
		person2.wohnort = "Linz";
		person2.Adresse.strasse = "Wiener Strasse";
		person2.Adresse.hausnr = 10;
		person2.Adresse.plz = 8010;
		person2.Adresse.ort = "Graz";
		
		System.out.println("Das ist " + person1.vorname + " " + person1.nachname + ". Er ist " + person1.alter + " Jahre alt und wohnt hier: " + person1.Adresse.strasse + " " + person1.Adresse.hausnr + ", " + person1.Adresse.plz + " " + person1.Adresse.ort + ".");
		System.out.println("Das ist " + person2.vorname + " " + person2.nachname + ". Er ist " + person2.alter + " Jahre alt und wohnt hier: " + person2.Adresse.strasse + " " + person2.Adresse.hausnr + ", " + person2.Adresse.plz + " " + person2.Adresse.ort + ".");
	}

}

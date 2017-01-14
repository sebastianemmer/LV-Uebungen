/*
 * > schlafen, hoppeln, fressen
 *   Konstruktor(String name) Funktion: sysout name+schl�ft 
 * 
 *  > Ableiten folgender Klassen mit speziellen Methoden
 *    Weihnachtshase (Geschenke verteilen)
 *    Osterhase (Ostereier verstecken)
 *    
 *  > App schreiben die Klassen verwendet
 */
package animal;

public class Hase {

	String name;

	public Hase(String name) {
		this.name = name;
	}

	public void schlafen() {
		System.out.println(name + " schl�ft gerade...");
	}

	public void hoppeln() {
		System.out.println(name + " hoppelt gerade umher...");
	}

	public void fressen() {
		System.out.println(name + " frisst gerade sein Futter...");
	}
	
	

}

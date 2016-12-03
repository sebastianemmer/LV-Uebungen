package org.campus02.zinsen.app;

import org.campus02.zinsen.biz.Zinsrechnung;

public class Zinsrechnung_app {

	public static void main(String[] args) {
		Zinsrechnung zins = new Zinsrechnung();
		
		System.out.println(zins.calculateZinsen(1534.44, 365, 2.548));
	}

}

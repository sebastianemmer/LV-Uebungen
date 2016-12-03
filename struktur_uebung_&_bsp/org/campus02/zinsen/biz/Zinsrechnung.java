package org.campus02.zinsen.biz;

public class Zinsrechnung {

	double zinsen;
	double kapital;
	int tage;
	double zinssatz;

	public double calculateZinsen(double kapital, int tage, double zinssatz) {
		
		double zinsen;
		
		zinsen = kapital * tage / 36000 * zinssatz;
		
		return zinsen;
	}
}

package edu.handong.csee.java.lab06;

/**
 * This class defines calculator objects<br>
 * This class has methods for a calculator <br>
 * methods:<br>
 * Setting values to the variables<br>
 * Calculating needed varialbes using inserted values<br>

 * @author Kim Myung Jin 21400082
 *
 */

public class BugInfestation {
	
	static double GROWTH_RATE = 0.95; //declaring variables needed in the methods
	static double ONE_BUG_VOLUME = 0.002;
	double housevol;
	double startpop;
	double totalbugvol;
	double newbugs = 0, newbugvol = 0;
	int countweek = 0;

	void set(double a, double b) //this method sets the inserted value to the variables in this class
	{
		housevol = a;
		startpop = b;
		totalbugvol = b * ONE_BUG_VOLUME;
	}
	
	void newinfo() //This method calculates the given variables
	{
		newbugs = startpop * GROWTH_RATE;
		newbugvol = newbugs * ONE_BUG_VOLUME;
		startpop = startpop + newbugs;
		totalbugvol = totalbugvol + newbugvol;
		countweek = countweek + 1;
	}
	
	
	
}



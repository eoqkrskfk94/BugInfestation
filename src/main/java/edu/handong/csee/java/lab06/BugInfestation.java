package edu.handong.csee.java.lab06; //Package

/**
 * This class defines calculator objects<br>
 * This class has methods for a calculator <br>
 * methods:<br>
 * Setting values to the variables<br>
 * Calculating needed varialbes using inserted values<br>
 * @author Kim Myung Jin 21400082
 *
 */
public class BugInfestation { //declaring BugInfestation class

	static double GROWTH_RATE = 0.95; //Making a static value where GROWTH_RATE has a value of 0.95
	static double ONE_BUG_VOLUME = 0.002; //Making a static value where ONE_BUG_VOLUME has a value of 0.002
	double housevol; //Declare housevol double variable
	double startpop; //Declare startpop double variable
	double totalbugvol; //Declare totalbugvol double variable
	double newbugs = 0, newbugvol = 0; //Declare newbugs,newbugvol int variables with the value of 0
	int countweek = 0; //Declare countweek int variable with the value of 0

	void Set(double a, double b) //this method sets the inserted value to the variables in this class
	{
		housevol = a; //Insert the value a into housevol
		startpop = b; //Insert the value b into startpop
		totalbugvol = b * ONE_BUG_VOLUME; //insert the value b*0.002 into totalbugvol
	}

	void Calculatenewinfo() //This method calculates the given variables
	{
		newbugs = startpop * GROWTH_RATE; //calculates newbugs
		newbugvol = newbugs * ONE_BUG_VOLUME; //calculates newbugvol
		startpop = startpop + newbugs; //calculates startpop
		totalbugvol = totalbugvol + newbugvol; //calculates totalbugvol
		countweek = countweek + 1; //week value in increased by 1
	}



}



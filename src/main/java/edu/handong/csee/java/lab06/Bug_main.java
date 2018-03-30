package edu.handong.csee.java.lab06; //Package

import java.util.Scanner; //imports the scanner class from Java utility

/**
 * This is the main class for buginfestation 
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class Bug_main { //declares bug_main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double house_vol; //declares variables that are to be used
		double pop; //declares variables that are to be used
		
		BugInfestation bug = new BugInfestation(); //calls out the class BugInfestation in order to use the methods in that class
		
		Scanner input = new Scanner(System.in); //creates scanner for insertion
		
		System.out.print("Enter the total volume of your house in cubic feet: ");  //prints out the given string
		house_vol = input.nextDouble(); //inserts entered value to the variable
		
		System.out.print("Enter estimated number of roaches in your house: "); //prints oute the given string
		pop = input.nextDouble(); //inserts entered value to the variable
		
		bug.Set(house_vol, pop); // the method set() in BugInfestation class is called and executed
		
		while(bug.totalbugvol < bug.housevol) //repeats the loop until totalbugvol is greater than housevol
		{
			bug.Calculatenewinfo(); //Calls out newinfo method in BugInfestation class
		}
		
		
		System.out.println("Starting with a roach population of " + pop); //prints out the given information(population)
		System.out.println("and a house with a volume of " + bug.housevol + " cubic feet,"); //prints out the given information (house volume)
		System.out.println("after " + bug.countweek + " weeks");  //prints out the given information (weeks)
		System.out.printf("the house will be filled with %.0f roaches.\n", bug.startpop); //prints out the given information (Start population)
		System.out.printf("They will fill a voule of %.0f cubic feet.\n", bug.totalbugvol); //prints out the given information (total bug volume)
		System.out.println("Better call Debugging Experts Inc.");  //prints out the given information
		
	}

}

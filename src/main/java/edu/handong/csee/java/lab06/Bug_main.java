package edu.handong.csee.java.lab06;

import java.util.Scanner;

/**
 * This is the main class for buginfestation 
 * 
 * @author Kim Myung Jin 21400082
 *
 */
public class Bug_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double house_vol; //declares variables that are to be used
		double pop;
		
		BugInfestation bug = new BugInfestation(); //calls out the class BugInfestation in order to use the methods in that class
		
		Scanner input = new Scanner(System.in); //creates scanner for insertion
		
		System.out.print("Enter the total volume of your house in cubic feet: "); 
		house_vol = input.nextDouble(); //inserts entered value to the variable
		
		System.out.print("Enter estimated number of roaches in your house: "); 
		pop = input.nextDouble(); //inserts entered value to the variable
		
		bug.set(house_vol, pop);
		
		while(bug.totalbugvol < bug.housevol) //repeats the loop until totalbugvol is greater than housevol
		{
			bug.newinfo(); //Calls out newinfo method in BugInfestation class
		}
		
		
		System.out.println("Starting with a roach population of " + pop); //prints out the given information
		System.out.println("and a house with a volume of " + bug.housevol + " cubic feet,");
		System.out.println("after " + bug.countweek + " weeks"); 
		System.out.printf("the house will be filled with %.0f roaches.\n", bug.startpop);
		System.out.printf("They will fill a voule of %.0f cubic feet.\n", bug.totalbugvol);
		System.out.println("Better call Debugging Experts Inc."); 
		
	}

}

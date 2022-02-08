package com.castillo.cafebusinesslogic;

import java.util.ArrayList;

public class CafeUtil {

		public void testing () {
			System.out.println("testing !!! we are conneced to this file now!");
		}
	
	public int getStreakGoal() {
		int total = 0; 
		
		for(int i = 1; i<=10; i++) {
			total += i; 
		}
		
		return total;
	}
//double getOrderTotal(double[] prices)

//Given an array of item prices from an order, 
//sum all of the prices in the array and return the total. 

public double getOrderTotal(double [] prices) {
	double total = 0; 
	
	
	//enhance for loop 
	for ( double singleItemPrice : prices) {
		 total += singleItemPrice;
		
//	for (double singleItemPrice : prices) {
//		total += singleItemPrice;
	}
	
	return total;
	}


//void displayMenu(ArrayList<String> menuItems)
//
//Given an ArrayList of menu items (strings), print out each index and menu item. 
//
//Sample output given an  ArrayList with the items "drip coffee",  "cappuccino",  "latte" and  "mocha"
public void displayMenu(ArrayList<String>menuItems) {
	for (int i = 0; i<menuItems.size(); i++) {
//		System.out.println(menuItems.get)(i);
		System.out.println(String.format("%s %s \n", i, menuItems.get(i)));
	}
}


}
package com.example.division;

/**
 * This class is the driver of the DivideNumber class. Which contains main
 * method and calling the divideNumbers method of that class by using object of
 * the same.
 * 
 * @author rjoshi4
 *
 */
public class DivideUser {
	
	public DivideUser() {
		// Parameterless Constructor
	}
	public static void main(String[] args) {
		DivideNumbers divideNumbers = new DivideNumbers();
		divideNumbers.divideNumbers(10, 2); 
	}

}

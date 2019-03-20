package com.example.division;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is the driver of the DivideNumber class. Which contains main
 * method and calling the divideNumbers method of that class by using object of
 * the same.
 * 
 * @author rjoshi4
 *
 */
public class DivideUser {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(DivideUser.class);
	
	public DivideUser() {
		// Parameterless Constructor
	}
	public static void main(String[] args) {
		DivideNumbers divideNumbers = new DivideNumbers();
		LOGGER.info(divideNumbers.divideNumbers(10, 2).toString()); 
	}

}

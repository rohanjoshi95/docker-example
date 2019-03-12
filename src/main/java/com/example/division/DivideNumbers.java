package com.example.division;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class contains the divideNumbers method to divide the numbers
 * 
 * @author rjoshi4
 *
 */
public class DivideNumbers {

	public static final Logger LOGGER = LoggerFactory.getLogger(DivideNumbers.class);

	/**
	 * Parameterless constructor
	 */
	public DivideNumbers() {
		// Parameterless Constructor
	}
	/**
	 * This method is to divide two numbers which accepts two parameters.
	 * 
	 * @param firstNumber
	 * @param secondNumber
	 */
	public Integer divideNumbers(Integer firstNumber, Integer secondNumber) {
		Integer division = 0 ;
		try {
			division = firstNumber / secondNumber;
			LOGGER.info("The division ",division);
		} catch (ArithmeticException e) {
			LOGGER.info("divide by zero exception");
			throw new ArithmeticException("divide by zero exception");
		}
		return division;
	}

}

package com.example.division;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class contains test methods to test every scenario for division
 * operation in DivideNumbers class.
 * 
 * @author rjoshi4
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class DivideNumbersTest {

	/**
	 * Object of DivideNumbers class use to call divideNumbers method.
	 * 
	 */
	DivideNumbers divideNumbers = new DivideNumbers();

	/**
	 * This method is to test the positive scenario when the input is valid.
	 *
	 */
	@Test
	public void checkPositiveScenario() {
		assertEquals(5.0, divideNumbers.divideNumbers(10, 2),1);
	}

	/**
	 * This method is to test when method throws ArithmeticException because of
	 * divide by zero.
	 *
	 */
	@Test(expected = ArithmeticException.class)
	public void checkNegativeScenario() {
		divideNumbers.divideNumbers(10, 0);
	}

	/**
	 * This method is to test the negative scenario when the input is null or
	 * Invalid
	 *
	 */
	@Test(expected = NullPointerException.class)
	public void checkNullValuesScenario() {
		divideNumbers.divideNumbers(10, null);
	}

}

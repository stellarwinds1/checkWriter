package com.mycompany.checkWriter;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.lang.Exception;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void checkConversion()
    {
		try {
			double d = 236501856.00;
			String convertedStr = CheckWriter.convert(d);
			// System.out.println("number is \"" + String.format("%12.2f", d) + "\" and is equal to \"" + convertedStr + "\"");
			assertEquals(convertedStr, "two hundred thirty six million five hundred one thousand eight hundred fifty six dollars only ");

			d = 586300056.12;
			convertedStr = CheckWriter.convert(d);
			// System.out.println("number is \"" + String.format("%12.2f", d) + "\" and is equal to \"" + convertedStr + "\"");
			assertEquals(convertedStr, "five hundred eighty six million three hundred  thousand fifty six dollars and 12/100 cents ");
		} catch (Exception e) {
			System.err.println("Caught exception " + e.getMessage());
		}
    }

	@Test
	public void checkNegativeNumberConversion() {
		try {
			double d = -23650000.00;
			String convertedStr = CheckWriter.convert(d);
			System.out.println("number is \"" + String.format("%12.2f", d) + "\" and is equal to \"" + convertedStr + "\"");

			fail("Expected to throw an exception for negative number, but was not thrown");
		} catch (Exception e) {
			System.err.println("Caught exception correctly for negative number: " + e.getMessage());
		}
	}

}

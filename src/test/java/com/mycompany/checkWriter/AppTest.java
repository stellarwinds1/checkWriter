package com.mycompany.checkWriter;

import static org.junit.Assert.assertTrue;

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
			System.out.println("number is \"" + String.format("%12.2f", d) + "\" and is equal to \"" + convertedStr + "\"");

			d = 586300056.12;
			convertedStr = CheckWriter.convert(d);
			System.out.println("number is \"" + String.format("%12.2f", d) + "\" and is equal to \"" + convertedStr + "\"");
		} catch (Exception e) {
			System.err.println("Caught exception " + e.getMessage());
		}
    }
}

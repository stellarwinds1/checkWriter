package com.mycompany.checkWriter;


/**
 * Check writer
 *
 */


class CheckWriter
{
	private static String units[] =  {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

	private static String doubles[] = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


	public static String convert(long longN)  throws Exception
	{
		if (longN < 0) {
			throw new Exception (longN + " is a negative number " );
		} else if (longN < 20) {
			return units[(int) longN];
		} else if (longN < 100) {
			return doubles[(int) (longN / 10)] + " " + CheckWriter.convert(longN % 10);
		} else if (longN < 1000) {
			return CheckWriter.convert(longN / 100) + " hundred " + CheckWriter.convert(longN % 100);
		} else if (longN < 1000000) {
			return CheckWriter.convert(longN / 1000)  + " thousand " + CheckWriter.convert(longN % 1000);
		} else if (longN < 1000000000) {
			return CheckWriter.convert(longN / 1000000)  + " million " + CheckWriter.convert(longN % 1000000);
		} else {
			return " too big a number to convert ";
		} 

	}

	public static String convert(double d) throws Exception
	{ 
		if ( (d - (long) d) == 0) {
			return convert((long) d) + " dollars only ";
		} else {
			return convert((long) d) + " dollars and " + String.format("%2.0f", (((d - (long) d)) * 100)) + "/100 cents ";
		}
	}
}

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

		long n = 236501856;

		try {
			System.out.println("n is " + n + " and is equal to \"" + CheckWriter.convert(n) + "\"");
		} catch (Exception e) {
			System.err.println("Caught exception " + e.getMessage());
		}
    }
}

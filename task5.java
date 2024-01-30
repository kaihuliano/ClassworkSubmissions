//import da scanner
import java.util.Scanner;

/** 
 * Create a class that will take an input, and print it without any spaces
 */
public class Task5 
{

	/** 
	 * main method that runs all the time where we call other method
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//take the scanners input
		Scanner stringChecker = new Scanner(System.in);
		
		//turn the scanners input into a string
		String str = stringChecker.nextLine();
		
		//call a method to count the amount of spaces
		nahSpace(str);
		
		//print out the string with no spaces
		System.out.print(noSpace(str));
		
		//close da scanner
		stringChecker.close();
		
		
	}

	/**
	 * method that will count the spaces
	 * @param str
	 * @return
	 */
	public static int nahSpace(String str) 
	{
		// TODO Auto-generated method stub
		
		//instantiate a number that will store the number of spaces
		int count = 0;
		
		//for loop that will run through the whole string and count for spaces
		for (int i = 0; i<str.length(); i++)
		{
			//if statement that will add 1 to count if there is a space
			if(str.charAt(i) == ' ')
			{
				//add wun tu count
				count++;
			}
			
		}
		//return count...
		return count;
		
	}
	/**
	 * method that will remove the spaces from the string
	 */
	public static String noSpace(String str)
	{
		// TODO Auto-generated method stub
		
		//turn the nahSpace method count into an int
		int num = nahSpace(str);
		
		//for loop to keep concat the spaces in the string
		for(int i = 0; i < num; i++)
		{
			
			String x = str.substring(str.indexOf(' ') + 1);
			
			str = str.substring(0, str.indexOf(' '));
			
			str = str.concat(x);
		}
		//return the string
		return str;
	}

}

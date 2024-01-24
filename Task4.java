//import scanner to scan input
import java.util.Scanner;


public class DiceRoll2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//open scannah
		Scanner diceRoll = new Scanner(System.in);
		
		//turn scanned word into string
		String bakaRoll = new String(diceRoll.nextLine());
		
		//close the scanner
		diceRoll.close();
		
		//create method to method  to tell the num
		getNums(bakaRoll);
		
		//create method to 
		
	}

	private static void getNums(String bakaRoll) {
		// TODO Auto-generated method stub
		//take the number before "d" to determine the amount of times rolled
		String first = bakaRoll.substring(0,bakaRoll.indexOf("d"));
		
		//take the number after "d" to determine the amount of sides on each dice
		String last = bakaRoll.substring(bakaRoll.indexOf("d") + 1,bakaRoll.length());
		
		//Print out the numbahs
		System.out.println("the first number is " + first + " " + "the last number is " + last);
		
		
		//create new method to turn the strings into ints and add them together
		turnInt(first,last);
	}

	private static void turnInt(String first, String last) {
		// TODO Auto-generated method stub
		//get value of number of times rolled
		int a = Integer.valueOf(first);
		//get value sides of dice
		int b = Integer.valueOf(last);
		//get the sum of the two values
		int sum = a + b;
		//print out the sum of the two values
		System.out.println(sum);
		
		//create a new method that will return a number based on how many and what kind of dice are rolled.
		rollDice(a,b);
	}
/**
 * Method that will return a number based on how many and what kind of dice are being rolled
 * @param a
 * @param b
 */
	private static void rollDice(int a, int b) {
		// TODO Auto-generated method stub
		//create int that will hold the value of the running count
		int hold = 0;
		//create loop that iterates the first number inputted times
		for (int i = 1; i < a + 1; i++) {
			//create int  that is equal to one roll
			int adder = (int)((double)Math.random() * b + 1);
			//print the result of the roll
			System.out.println(adder);
			//add the current roll to the running total
			hold += adder;
		}
		//print the sum of all rolls
		System.out.println(hold);
	}

}

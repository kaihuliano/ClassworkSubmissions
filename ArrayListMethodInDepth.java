//import Array List
import java.util.ArrayList;

/**
 * Array list methods in depth
 */
public class ArrayListMethodsInDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//empty ArrayList foods that stores Strings
		ArrayList<String> foods = new ArrayList<String>();
		
		//Add Apples, Bread, and Cookies to food
		foods.add("Apples");
		foods.add("Bread");
		foods.add("Cookies");
		
		//print out the length of da arraylist and returns the length
		System.out.println(foods.size());
		
		//add the String "Dole Whip" to foods, prints out true too
		//adds array list and returns a boolean
		System.out.println(foods.add("Dole Whip"));
		
		//Inside of a print statement, use the .set(E) method to change 
		//"Bread" in foods to "Butter"  -  will print bread
		//returns the element that was removed
		System.out.println(foods.set(1, "Butter"));
	
		//.remove(int) method to remove "Cookies" from foods.
		//prints cookies
		//returns the element that was removed
		System.out.println(foods.remove(2));
		
		
	}

}

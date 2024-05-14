import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an empty ArrayList studentNames of Strings
		ArrayList<String> studentNames = new ArrayList<String>();
		
		//Add the following String literals to studentNames: "Alice", "Charlie", "Dave", "Elizabeth", "Fieri", "Gwen". 
		//The ArrayList should hold them in this order. 
		//Print the ArrayList to make sure it is organized correctly.
		studentNames.add("Alice");
		
		studentNames.add("Charlie");
		
		studentNames.add("Dave");
		
		studentNames.add("Elizabeth");
		
		studentNames.add("Fieri");
		
		studentNames.add("Gwen");
		
		//check if works
		System.out.println(studentNames);
		
		//Now add "Brittany" directly after "Alice."
		studentNames.add(1, "Brittany");
		
		//Charlie got expelled. Remove her from the ArrayList. 
		studentNames.remove(2);
		
		// I forgot who is at the 2 index. 
		//Please get the value of the String literal at index 2 and then print studentNames.
		System.out.println(studentNames.get(2));
		System.out.println(studentNames);
		
		//Elizabeth had a name change. 
		//Set the value of the String literal where "Elizabeth" is to "Evan".
		studentNames.set(3, "Evan");

				
	}

}

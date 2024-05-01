import java.util.ArrayList;

public class ArrayListSorters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiate two ArrayLists nums and names of Integers
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		ArrayList<String> names = new ArrayList<String>();
		
		//Fill them with five unsorted values 
		nums.add(9);
		nums.add(4);
		nums.add(8);
		nums.add(5);
		nums.add(6);
		
		//Fill them with five unsorted values
		names.add("carl");
		names.add("john");
		names.add("fran");
		names.add("kai");
		names.add("brady");
		
		
		
	}
	//Create a void method bubbleSortNumbers that is passed an ArrayList and 
	//bubble sorts it just like we did for arrays. 
	public static void bubbleSortNumbers(ArrayList<Integer> nums) 
	{
		//for loop to traverse through the array
		 for(int j = 0; j < nums.size(); j++)
		 {
		//for loop to traverse again like one bubble kin
		 for(int i = 0; i < nums.size()-1; i++)
		 {
			//compare the integer with the one next to it
			 if (nums.get(i) > nums.get(i+1))
			 {
				//switch/sort the two ints
				 Integer place = nums.set(i, nums.get(i+1));
				 nums.set(i + 1, place);
			 }
		 }
		 
		
		 }	
	}
	//Create a void method bubbleSortStrings that is passed an ArrayList and bubble sorts 
	//it into alphabetical order. 
	public static void bubbleSortStrings(ArrayList<String> names)
	{
		//for loop to traverse through the array
		 for(int j = 0; j < names.size(); j++)
		 {
		//for loop to traverse again like one bubble kine	 
		 for(int i = 0; i < names.size()-1; i++)
		 {
			 //compare the string with the one next to it
			 if (names.get(i).compareTo(names.get(i+1)) > 0)
			 {
				 //switch/sort the two strings
				 String place = names.set(i, names.get(i+1));
				 names.set(i + 1, place);
			 }
		 }
		 
		
		 }	
	}

}


public class MekLikeBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call the method and make it equal to an int array
		int[] randomNumbers = makeRandom();
		
		//declares an int nums = to the array returned by the method bubbleSort()
		bubbleSort(randomNumbers);
		
	}
		/**
		 * bubble sort method that sorts an array itself
		 * @param arr
		 */
		public static void bubbleSort(int[]arr)
		{
		//for loop that sets j equal to zero and increases by 1 until it is one less than the length of the array
		for (int j = 0; j < arr.length-1; j++)
		{
	    //for loop that sets i equat to zero and increases by 1 until it is less than the length of the array
		for(int i = 0; i < arr.length; i++)
		{
			//check if the element at int i is greater than the next element
			if (arr[i] > arr[i+1])
			{
				//swap the current element with the next element if true
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}
		}	
		}
	}
	
	/**
	 * call a method that traverses an array and returns 2000 random number
	 */
	private static int[] makeRandom() {
		//instantiate an int array that has 2000 elements
		int[] bigNums = new int[2000];
		//take the length of the array and turn it into an into
		int len = bigNums.length;
		//create a for loop that traverses all elements in the array
		for (int i = 0; i < len; i++)
		{
			//for each element get a random number, multiply it by 1000 and add 1 and make it an int
			int randomNumber = (int) ((Math.random() * 1000) + 1);
			//store the random number
			bigNums[i] = randomNumber;
			
		}
		//return that random number
		return bigNums;
	}
	/**
	 * Use the printArr method we created in the past to print the final sorted array, 
	 * just to make sure everything works. 
	 * @param arr
	 */
	public static void printArr(int[] arr)
	{
		int traverser;
		for (traverser = 0; traverser < arr.length; traverser++)
		{
			System.out.println(arr[traverser]);
		}
	}
}

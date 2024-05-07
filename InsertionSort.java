
public class InsertionSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		
		int[] arr = {2,5, 7, 8, 10, 2};
		// Create a method arrayShifter that when passed an array of ints, will take the last element and sort it into the right place.
		//(Precondition: The array will be sorted except for the last element.)
		arrayShifter(arr);
		
		
		//Change the previous method so that it is passed an int index and will sort the value
		//at that index instead of the last index. (Precondition: the rest of the array will be sorted)
		arrayShifterTwo(arr, x);
		
		//Change the previous method so that it is passed an int index and will sort the value at that index instead of the last index.   
		insertionSort(arr);
	}
	/**
	 * Change the previous method so that it is passed an int index and will sort the value at that 
	 * index instead of the last index. (Precondition: the rest of the array will be sorted)
	 * @param arr
	 */
	private static void insertionSort(int[] arr) 
	{
		// TODO Auto-generated method stub
		 //for loop which sets integer i to 1 and increments it until it is not less
		//than the length of the array
		for (int i = 1; i < arr.length; i++)
		{
			//check and sort each element of the array 
			arrayShifterTwo(arr, i); 
		}
	}
	/**
	 * Change the previous method so that it is passed an int index and will sort the value at that 
	 * index instead of the last index.(Precondition: the rest of the array will be sorted)
	 * @param arr
	 * @param x
	 */
	private static void arrayShifterTwo(int[] arr,int x) {
		// TODO Auto-generated method stub
		
		//create
		while(x > 0 && arr[x]<arr[x-1])
		{
			//switch out the two elements
			int a = arr[x];
			arr[x] = arr[x-1];
			arr[x-1] = arr[x];
			
			x--;
		
	}

	}
	/**
	 *  Create a method arrayShifter that when passed an array of ints, will take the last element and sort it into the right place.
	 *  (Precondition: The array will be sorted except for the last element.)
	 * @param arr
	 */
	private static void arrayShifter(int[] arr) 
	{
		int i = arr.length - 1;
		while(i > 0 && arr[i]<arr[i-1])
		{
			int a = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = arr[i];
			i--;
		}
	
	}

}

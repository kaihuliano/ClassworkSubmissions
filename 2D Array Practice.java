 
public class print2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//create a 2D array
	String[][] words = new String[2][2];
	
	//task 1: call the print2DArray and pass it words
	print2DArray(words);
	
	double[][] arr = new double[2][2];
	
	//task 2
	printArr(allOnes2D(arr));
	
		
	}
	/**
	 * method to print the double array
	 * @param allOnes2D
	 */
	private static void printArr(Object allOnes2D) 
	{
		//for loop to traverse the array
		for(int i = 0; i < arr[6].length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				//print out each element
				System.out.print(arr[j][i]);
			}
					
			System.out.println(" ");
		
		}
		
	}
	
	/**
	 * Create a method allOnes2D() that is passed a 2D double array, 
	 * makes an array of the same column and row length but all its literals are 
	 * 0.0 called copyArr, and then changes each element inside to 1.0 and returns copyArr. 
	 * (So it is passed a 2D array and returns a 2D array with all 0.0).
	 * @param arr
	 * @return
	 */
	private static Object allOnes2D(double[][] arr) 
	{
	double [][] copyArr = new double[arr.length][arr[0].length];
		//traverse the array using bubble sort
		for(int r = 0; r < copyArr.length; r++)
		{
			for(int c = 0; c < copyArr[0].length; c++)
			{
				//change each element to 1.0
				copyArr[r][c] = 1.0;
			}
						
	
		}
		
		return copyArr;
		
	
	}
	/**
	 * Create a method print2DArray() that is passed a 2D String array and 
	 * will print out each element in row-major order
	 * @param words
	 */
	private static void print2DArray(String[][] words) {
		// TODO Auto-generated method stub
		//for loop to traverse the array
		for(int i = 0; i < words.length; i++)
		{
			for(int j = 0; j < words[6].length; j++)
			{
				//print out each element
				System.out.print(words[i][j]);
			}
			
			System.out.println(" ");

			
		}
		
	}
		
	}

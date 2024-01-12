public class DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1; i < 200; i++)
		{
		System.out.println((int)(Math.random() * 17 + 1));
		}
		
		
		//string/word that we are letter checking
		String myName = "KAIBABY";
		//letter we are checking for
		Character x = 'A';
		//call the method with the string and char included
		countChars(myName, x);
		
		
	}
	//method that checks how many times char appears in string
	private static void countChars(String str, Character c) {
		// TODO Auto-generated method stub
		//number of times the char appears starting at 0
				int count = 0;
			    // for loop that runs the check for each letter
				//will run as many times as there are chars in the string
			    for(int i=0; i < str.length(); i++)
			   //check if the char being checked is the char were checking for
			   //uses a value that increases by 1 to change the letter being checked each time the code iterates
			    {    if(str.charAt(i) == c)
			    //add one to the count when it equals what we want
			            count++;
			    }
			    //print the final count
			    System.out.println(count);
	}
}

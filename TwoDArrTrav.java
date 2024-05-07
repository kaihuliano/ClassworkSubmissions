
public class TwoDarrTrav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[][] name = { {"a","b","c","d","e","f"},
			{"g","h","i","j","k","l"},
			{"m","n","o","p","q","r"},
			{"s","t","u","v","w","x"},
			{"y","z","aa","bb","cc","dd"},
			{"ee","ff","gg","hh","ii","jj"},
			{"kk","ll","mm","nn","oo","pp"} };
		
		System.out.println(name [0][0]);
		System.out.println(name [1][0]);
		System.out.println(name [2][0]);
		System.out.println(name [3][0]);
		System.out.println(name [4][0]);
		System.out.println(name [5][0]);

		
		for(int i = 0; i < name.length; i++)
		{
			System.out.print(name [i][0]);
		}
		
		for(int i = 0; i < name.length; i++)
		{
			System.out.print(name [0][i]);
		}
		for(int i = 0; i < name.length; i++)
		{
			System.out.print(name [1][i]);
		}
		for(int i = 0; i < name.length; i++)
		{
			System.out.print(name [2][i]);
		}
		for(int i = 0; i < name.length; i++)
		{
			System.out.print(name [3][i]);
		}
		for(int c = 0; c<name[0].length;c++)
		{
			for(int r = 0; r<name.length;r++)
			{
				System.out.print(name[c][r]);
			}
		}
		
		}
	}



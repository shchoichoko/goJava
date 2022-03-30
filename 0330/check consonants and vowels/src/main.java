import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toLowerCase();
		int consoCount=0;
		int vowelSum = countChar(str,'a')+countChar(str,'e')+countChar(str,'i')
		+countChar(str,'o')+countChar(str,'u');
		consoCount=str.length()-countChar(str,' ')-vowelSum;
		System.out.println("Num. of Consonant : "+consoCount);
		System.out.println("Num. of Vowels : "+vowelSum);
	}
	public static int countChar(String str, char ch)
	{
		int count = 0;
		for(int i = 0; i<str.length();i++)
		{
			if(str.charAt(i)==ch) 
			{
				count++;
			}
		}
		return count;
	}

}

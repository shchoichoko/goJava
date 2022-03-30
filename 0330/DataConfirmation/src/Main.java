import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str ; boolean pass=true;
		int lengthCheck;int count=0;
		//The string length should be over 4.
		//The string length should be below 13.
		//The string should be without gap.
		//The string should contain one of the following symbols '!','@','#','$'. 
		//The string should contain at least one uppercase
		while(pass) {
			System.out.println("#The string length should be over 4.");
			System.out.println("#The string length should be below 13.");
			System.out.println("#The string should be without gap.");
			System.out.println("#The string should contain one of the following symbols '!','@','#','$'.");
			System.out.println("#The string should contain at least one uppercase.");
			System.out.println("Please input password");
			str=sc.nextLine();
			
			lengthCheck=checkLength(str.length());
			if(lengthCheck==1) {
				if(!str.contains(" "))
				{
					if((str.contains("!")||str.contains("@")||str.contains("#")||str.contains("$")))
					{
						for(int i=0;i<str.length();i++)
						{
							
							char ch=str.charAt(i);
							if(ch>'A'&&ch<'Z')
							{
								count++;
							}
							
						}
						
						System.out.println("PASS");
						pass=false;
					}
				}
			}
			
			else {
				System.out.println("FAIL");
				pass=false;
			}
		}
	}
	public static int checkLength(int a)
	{
		int result=0;
		if(a<13&&a>4)
		{
			result=1;
		}
		return result;
	}
}

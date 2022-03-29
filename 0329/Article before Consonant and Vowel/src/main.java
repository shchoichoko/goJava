import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] strArr = input.split(" ");
		
		
		for(int i=0;i<strArr.length;i++)
		{
			if(strArr[i].substring(0,1).contains("a")||strArr[i].substring(0,1).contains("e")||strArr[i].substring(0,1).contains("i")
					||strArr[i].substring(0,1).contains("o")
					||strArr[i].substring(0,1).contains("u"))
			{
				if(strArr[i-1].equals("a")) {
					strArr[i-1]=strArr[i-1].replace("a", "an");
					System.out.print(strArr[i-1]+" ");
					
				}
				
			}
			System.out.print(strArr[i]+" ");
		}
		
		
	}

}

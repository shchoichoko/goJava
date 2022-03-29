import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int addNum=0;int positNum=0;int negaNum=0;int oddNum=0;int evenNum=0;
		while(true)
		{
			System.out.println("Please input a number");
			addNum = sc.nextInt();
			if (addNum == 0) {
				System.out.println("Error!");
				continue;
			}
			if(addNum>0)
			{positNum++;}
			if(addNum<0)
			{negaNum++;}
			if(addNum%2!=0)
			{oddNum++;}
			if(addNum%2==0)
			{evenNum++;}
			System.out.println("P - "+positNum+", "+"N - "
			+negaNum+", "+"O - "+oddNum+", "+"E - "+evenNum);
		}
	}
}

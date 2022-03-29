import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please input numbers and operation.\nex) 5+5");
		float result = 0;
		String front=" ";String back=" ";String oper = " ";
		String input = sc.nextLine();
		int standardNum = input.indexOf("+");
		int stdNum2 = input.indexOf("-");
		int stdNum3 = input.indexOf("/");
		int stdNum4 = input.indexOf("*");
		if(standardNum!=-1)
		{
			front = input.substring(0,standardNum);
			oper = input.substring(standardNum,standardNum+1);
			back = input.substring(standardNum+1,standardNum+1);
		}
		if(stdNum2!=-1) 
		{
			front = input.substring(0,standardNum);
			oper = input.substring(standardNum,standardNum+1);
			back = input.substring(standardNum+1,standardNum+1);
		}
		if(stdNum3!=-1) 
		{
			front = input.substring(0,standardNum);
			oper = input.substring(standardNum,standardNum+1);
			back = input.substring(standardNum+1,standardNum+1);
		}
		if(stdNum4!=-1) 
		{
			front = input.substring(0,standardNum);
			oper = input.substring(standardNum,standardNum+1);
			back = input.substring(standardNum+1,standardNum+1);
		}

		float frontNum = Float.parseFloat(front);
		float backNum = Float.parseFloat(back);
		System.out.println(oper);
		switch(oper)
		{
			case "+":
			{
				result = frontNum+backNum;
				break;
			}
			case "-":
			{
				result = frontNum-backNum;
				break;
			}
			case "/":
			{
				result = frontNum/backNum;
				break;
			}
			case "*":
			{
				result = frontNum*backNum;
				break;
			}
					
		}
	}

}

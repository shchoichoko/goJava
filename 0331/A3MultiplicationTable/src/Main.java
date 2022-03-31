import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	Main main = new Main();
    	System.out.println("Please input a number");
    	int tableNum = sc.nextInt();
        main.printTable(tableNum, 1);
    }
    public void printTable(int level, int multi)
    {
      if (multi > 9)
      {
          return;
      }
      System.out.println(level +" X " + multi + " = " + level*multi);
      printTable(level, multi+1);
  }
}
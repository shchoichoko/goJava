package PacA;

public class Test1 {

	public void printMultiple() {
		
		for(int i = 2;i<10;i++)
		{
			for(int j= 1;j<10;j++)
			{
				System.out.println(i + " X " + j +" = " + i*j);
			}
			System.out.println("");
		}
		

	}
	public void printHw() {
		System.out.println("Hello World!");
	}
	public Test1() {
		System.out.println("Object created");
	}
	public Test1(String name) {
		System.out.println(name+" Object created");
	}
}

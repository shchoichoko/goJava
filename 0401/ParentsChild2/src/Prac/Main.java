package Prac;

public class Main implements Parents{

	public static void main(String[] args) {

		Main main = new Main();
		main.myAge();
		main.myName();
		
	}

	@Override
	public void myName() {
		// TODO Auto-generated method stub
		System.out.println("My name is Choko");
		
	}

	@Override
	public void myAge() {

		System.out.println("My age is 9");
	}

}

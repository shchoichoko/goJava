package Practice;

public class Main extends Parents{

	public static void main(String[] args) {

		Main main = new Main();
		main.myName();
		main.myAge();
	}

	@Override
	public void myName() {
		// TODO Auto-generated method stub
		super.myName();
		System.out.println("Son : Mike");
	}
	@Override
	public void myAge() {
		// TODO Auto-generated method stub
		super.myAge();
		System.out.println("Son : 50");
	}

}

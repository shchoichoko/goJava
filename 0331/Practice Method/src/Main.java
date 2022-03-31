
public class Main {

	public static void main(String[] args) {
		showMyMoney1();
		showMyMoney2();
		Main main = new Main();
		main.showMyMoney2();
		main.showMyMoney3();
		main.showMyMoney4();
		main.showMyMoney5();
		
	}

	public static void showMyMoney1() {
		System.out.println("1000wonshow1");
	}

	public static  void showMyMoney2() {
		System.out.println("1000wonshow2");
	}

	private void showMyMoney3() {
		System.out.println("1000wonshow3");
	}

	protected void showMyMoney4() {
		System.out.println("1000wonshow4");
	}

	void showMyMoney5() {
		System.out.println("1000wonshow5");
	}
}
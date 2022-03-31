import java.util.Scanner;
//static final 을 이름 정하기
public class Main {
	public static final String Father = "Peter";
	public static final String Mother = "Jane";
	public static final String Son = "Jone";
	public static final String Daughter = "Mary";
	public static final int fatherNum = 1, motherNum = 2, sonNum = 3, daughterNum = 4;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main add = new Main();
		add.showMenu();
		int choose = sc.nextInt();
		add.addition(choose);
	}
	public void showMenu()
	{
		
		System.out.println("#Printing a Name");
		System.out.println("1. Father\n2. Mother\n3. Son\n4. Daughter");
		
	}
	
	public void addition(int familyMember) {
		if (familyMember == fatherNum) {
			System.out.println(Father);
		} else if (familyMember == motherNum) {
			System.out.println(Mother);
		} else if (familyMember == sonNum) {
			System.out.println(Son);
		} else if (familyMember == daughterNum) {
			System.out.println(Daughter);
		} else {
			System.out.println("ERROR!");
		}
	}

}

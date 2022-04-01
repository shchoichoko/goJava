import java.util.Scanner;

public class Main {
	int courseNum = 0;
	static String[] courseArr = { "Korean", "Math", "English", "Social Studies", "Science" };
	static String coursePrint = " ";
	static int koreanClass = 0,mathClass = 0, englishClass = 0, socialClass = 0, scienceClass = 0;
	
	public static void main(String[] args) {
		
		printMenu();

	}

	public static void printMenu() {
		Scanner sc = new Scanner(System.in);
		int courseReturn = 0;
		boolean menuRepeat = true; boolean courseRepeat = true;
		while(menuRepeat) {
		System.out.println("> Menu ");
		System.out.println("1. Course List ");
		System.out.println("2. My Course ");
		System.out.println("3. Exit ");
		int selectCourse = 0;
		courseRepeat = true;
		int menu = sc.nextInt();
		switch (menu) {
		case 1: {
			while(courseRepeat) {
				System.out.println("> Course List");
				System.out.println("1. Korean\n2. Math\n3. English\n4. Social Studies");
				System.out.println("5. Science\n0. Back to Main");
				System.out.print("->");
				
				selectCourse = sc.nextInt();
					if(selectCourse == 1) {
						courseList(0);
						koreanClass = 1;
					}
					else if(selectCourse == 2) {
						courseList(1);
						mathClass = 1;
					}
					else if(selectCourse == 3) {
						courseList(2);
						englishClass = 1;
					}
					else if(selectCourse == 4) {
						courseList(3);
						socialClass = 1;
					}
					else if(selectCourse == 5) {
						courseList(4);
						scienceClass = 1;
					}
					else if(selectCourse == 0) {
						courseRepeat = false;
					}
					else {
						System.out.println("Error!!");
						System.out.println("Return to Menu");
						courseRepeat = false;
					}
				}
			break;
		}
		case 2: {
				showList(0);
				System.out.println("- END -");
				break;
		}
		case 3: {
			System.out.println("ByeBye");
			menuRepeat = false;
			break;
		}
		default: {
			System.out.println("Error!");
			break;
		}
		}
		}
	}
	public static void courseList(int a)
	{
		
		
		coursePrint = courseArr[a];	
		System.out.println("\""+coursePrint+"\" is registered.");
		System.out.println(" ");
		
	}
	public static void showList(int a){
		if(koreanClass == 1) {
			System.out.println("\""+courseArr[0]+"\"");
		}
		if(mathClass == 1) {
			System.out.println("\""+courseArr[1]+"\"");
		}
		if(englishClass == 1) {
			System.out.println("\""+courseArr[2]+"\"");
		}
		if(socialClass == 1) {
			System.out.println("\""+courseArr[3]+"\"");
		}
		if(scienceClass == 1) {
			System.out.println("\""+courseArr[4]+"\"");
		}
	}
}

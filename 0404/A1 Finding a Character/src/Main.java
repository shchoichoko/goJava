import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String findCha = sc.nextLine(); 
		sc.close();
		System.out.println(str.indexOf(findCha)+1);
	}

}

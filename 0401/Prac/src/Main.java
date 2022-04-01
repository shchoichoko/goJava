import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//The each operation should be done in separate functions
		//The name of the functions should be the same
		//The calculated value should be a return value
		//번호  별로 각자의 함수를 가져야 한다.
		//함수의 이름은 같아야한다.
		//계산된 값은 리턴 값으로 받아야 한다.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		System.out.println("1. Apple\n2. Strawberry\n3. Grape\n4. Watermelon");
		int menu = sc.nextInt();
		Fruit ft = new Fruit(menu, menu, menu, menu);
		int price = ft.price(menu);
		System.out.println(price);
	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//The each operation should be done in separate functions
		//The name of the functions should be the same
		//The calculated value should be a return value
		//��ȣ  ���� ������ �Լ��� ������ �Ѵ�.
		//�Լ��� �̸��� ���ƾ��Ѵ�.
		//���� ���� ���� ������ �޾ƾ� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		System.out.println("1. Apple\n2. Strawberry\n3. Grape\n4. Watermelon");
		int menu = sc.nextInt();
		Fruit ft = new Fruit(menu, menu, menu, menu);
		int price = ft.price(menu);
		System.out.println(price);
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		print();
	}
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibo(n - 2) + fibo(n - 1);
		}
	}
	public static void print() {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Please input a number");
		int fiboNum = sc.nextInt();
		
		for (int i = 0; i < fiboNum; i++) {
			list.add(fibo(i));
		}
		System.out.println(list);
	}
}

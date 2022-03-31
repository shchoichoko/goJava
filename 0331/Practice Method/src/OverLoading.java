
public class OverLoading {

	public static void main(String[] args) {

		print("Hello");
		print(1 , 3);
		
	}
	public static void print(String text) {
		System.out.println(text);
	}

	public static void print(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}
}

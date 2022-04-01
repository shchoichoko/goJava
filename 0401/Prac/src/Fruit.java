
public class Fruit {
	//The each operation should be done in separate functions
	//The name of the functions should be the same
	//The calculated value should be a return value
	//번호  별로 각자의 함수를 가져야 한다.
	//함수의 이름은 같아야한다.
	//계산된 값은 리턴 값으로 받아야 한다.
	int a, b, c, d;
	public Fruit(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int price(int a) {
		this.a = a;
		a = 5000;
		return a;
	}
	public int price(int a, int b) {
		this.a = a;
		this.b = b;
		a = 5000;

		return a+b;
		
	}
	public int price(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		int sum = this.a+this.b+this.c;
		return sum;
	}
	public int price(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		int sum = a + b + c + d;
		return sum;
	}
}

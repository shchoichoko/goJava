import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		print();

	}
	
	public static double calculateAvg(int a, int b) {
		double avgValue = 0;
		avgValue = (double) a / b;
		return avgValue;
	}
	
	public static void print() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number");
		System.out.print("->");
		double variance = 0;
		double deviation = 0;
		int num = sc.nextInt();
		if( num == 0 ) {
			System.out.println("error");
		} else {
			int sum = 0;
			double avg = 0;
			for (int i = num; i > 0; i--) {
				sum += i;
				System.out.println(i);
			}
			avg = calculateAvg(sum, num);
			variance = getVariance(avg,num);
			deviation = Math.sqrt(variance);
			System.out.println("Standard deviation : " + String.format("%.2f", deviation));
		}
	}
	
	public static double getVariance(double avg, int num) {
		double variance = 0;double subtractValue = 0;
		double sum = 0; 
		for(double i = num; i > 0;i=i-1) {
			subtractValue = i - avg;
			sum += subtractValue*subtractValue;
		}
		variance = sum/(num-1);
		return variance;
	}
}

package Review01;

import java.util.Scanner;

public class ComparingVelocities {

	public static void main(String[] args) {
		double firstMs = print(1);		
		double secondKmh = print(2);	
		double thirdmms = print(3);		
		double winner = compareHowFast(firstMs,kmhToMs(secondKmh),mmsToMs(thirdmms));	
		print(firstMs,kmhToMs(secondKmh),mmsToMs(thirdmms),winner);	
	}
	
	public static double print(int order) {
		double inputSpeed = 0.0; 
		String temp = "";
		Scanner sc = new Scanner(System.in);
		if(order == 1) {
			System.out.println("Please input the first velocity (m/s)");	
			temp = sc.nextLine();
			inputSpeed = Double.parseDouble(temp);
		} else if(order == 2) {
			System.out.println("Please input the second velocity (km/h)");	
			temp = sc.nextLine();
			inputSpeed = Double.parseDouble(temp);
		} else {
			System.out.println("Please input the third velocity (m/ms)");	
			temp = sc.nextLine();
			inputSpeed = Double.parseDouble(temp);
		}
		return  inputSpeed;
	}
	
	public static double kmhToMs(double inputSpeed) {
		double returnVelocity = inputSpeed*1000*3600;	
		return returnVelocity;
	}
	
	public static double mmsToMs(double inputSpeed) {
		double returnVelocity = inputSpeed/1000;	
		return returnVelocity;
	}
	
	public static double compareHowFast(double first, double second, double third) {
		double fastestOne = 0.0;
		if ((first >= second) && (first >= third)) {	
			fastestOne = first;
		} else if (second > first && second > third)	
			fastestOne = second;	
		else {										
			fastestOne = third;
		}
		return fastestOne;			
	}
	
	public static void print(double first, double second, double third, double winner) {
		if(first == winner) {
			System.out.printf("The Fastest one is... %.0f m/s",first);
		} else if(second == winner) {
			System.out.printf("The Fastest one is... %.0f km/h",second/1000/3600);
		} else if(third == winner) {
			System.out.printf("The Fastest one is... %.0f m/ms",third*1000);
		}
	}

}

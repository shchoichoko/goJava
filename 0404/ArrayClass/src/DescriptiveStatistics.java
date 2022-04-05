import java.awt.Point;
import java.util.Arrays;

public class DescriptiveStatistics {
	static int koreanSum = 0, englishSum = 0, mathSum = 0, jeong = 0, pyo = 0, choi = 0, mike = 0;
	public static void main(String[] args) {
		
		String[][] points = {{"Jeong","70","80","100"},{"Pyo","60", "70", "86"},{"Choi","54","100","82"},{"Mike","87", "95", "79"}};
		String[] koreanPoints = new String[points.length];
		String[] englishPoints = new String[points.length];
		String[] mathPoints = new String[points.length];
		
		for(int i = 0; i < points.length; i++) {
			for(int j = 1; j < points[i].length; j++) {
				jeong += Integer.parseInt(points[0][j]);
				pyo += Integer.parseInt(points[1][j]);
				choi += Integer.parseInt(points[2][j]);
				mike += Integer.parseInt(points[3][j]);
			}
			
			koreanSum += Integer.parseInt(points[i][1]);
			englishSum += Integer.parseInt(points[i][2]);
			mathSum += Integer.parseInt(points[i][3]);
		}
		// koreanPoints Array
		for(int i = 0; i < points.length; i++) {
			koreanPoints[i] = points[i][1];
		}
		// englishPoints Array
		for(int i = 0; i < points.length; i++) {
			englishPoints[i] = points[i][2];
		}
		// mathPoints Array
		for(int i = 0; i < points.length; i++) {
			mathPoints[i] = points[i][3];
		}
		
		// selection sort
		for(int i = 0; i < koreanPoints.length; i++) {
			String temp = "";
			for(int j =i+1; j < koreanPoints.length; j++) {
				if(Integer.parseInt(koreanPoints[i])>Integer.parseInt(koreanPoints[j])) {
					temp = koreanPoints[i];
					koreanPoints[i] = koreanPoints[j];
					koreanPoints[j] = temp;
				}
			}
		}
		for(int i = 0; i < englishPoints.length; i++) {
			String temp = "";
			for(int j =i+1; j < englishPoints.length; j++) {
				if(Integer.parseInt(englishPoints[i])>Integer.parseInt(englishPoints[j])) {
					temp = englishPoints[i];
					englishPoints[i] = englishPoints[j];
					englishPoints[j] = temp;
				}
			}
		}
		for(int i = 0; i < mathPoints.length; i++) {
			String temp = "";
			for(int j =i+1; j < mathPoints.length; j++) {
				if(Integer.parseInt(mathPoints[i])>Integer.parseInt(mathPoints[j])) {
					temp = mathPoints[i];
					mathPoints[i] = mathPoints[j];
					mathPoints[j] = temp;
				}
			}
		}
		
		System.out.println("Korean MinPoints : " + koreanPoints[0]);	
		System.out.println("English MinPoints : " + englishPoints[0]);	
		System.out.println("Math MinPoints : " + mathPoints[0]);	
		System.out.print("Korean Summation points : " + koreanSum);
		System.out.println("\tKorean Average points : " + koreanSum/4);
		System.out.print("English summation points : " + englishSum);
		System.out.println("\tEnglish Average points : " + englishSum/4);
		System.out.print("Math summation points : " + mathSum);
		System.out.println("\tMath Average points : " + mathSum/4);
		System.out.println("Jeong's Average points : " + jeong/12);
		System.out.println("Pyo's Average points : " + pyo/12);
		System.out.println("Choi's Average points : " + choi/12);
		System.out.println("Mike's Average points : " + mike/12);
		
	}


}

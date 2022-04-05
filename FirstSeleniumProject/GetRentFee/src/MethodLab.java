import java.util.Arrays;

public class MethodLab {

	public static void main(String[] args) {

		
		// 도시 구군 배열 
		int[] city = {11};
		// 서울시 구군 배열   11680,11740,11305,11500,11620,11215,11530
		int[] gugun = {11680,11740};
		
		// 서울시 강남구 동 배열  1168010300, 1168010800, 1168010600 , 1168011800
		int [] gu = {1168010300, 1168010800, 1168010600};
		
		for(int i = 0; i < city.length; i++) {
			for(int j = 0; j < gugun.length; j++) {
				for(int p = 0; p < gu.length; p++) {
					System.out.println(gu[i]);
				}
			}
		}
		
	}
	public static void print() {
		System.out.println("Click");
		System.out.println("Waiting A Moment");
		
	}
}

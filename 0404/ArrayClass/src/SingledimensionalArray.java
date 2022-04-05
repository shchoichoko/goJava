
public class SingledimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[10];
		String[] names = {"kim", "lee", "park"};

		names[0]  = "kim2";
		names[1]  = "lee2";
		names[2]  = "park2";
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
	}

}

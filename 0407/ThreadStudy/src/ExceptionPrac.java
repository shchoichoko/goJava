
public class ExceptionPrac {

	public static void main(String[] args) {

		int[] numbers = {5, 10, 12};
		try {
			System.out.println(numbers[3]);
		}catch(NullPointerException e){
			e.printStackTrace();
			System.out.println("NullPointException !");
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("ArrayIndexOutOfBound Exception");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("General Exception");
		} finally {
			System.out.println("finally");
		}
		
	}

}

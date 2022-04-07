
public class First {

	public static void main(String[] args) {

		String line = "abc";
		try {
			System.out.println(line.charAt(2));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("error!");
		}
		System.out.println("Hello World");

	}

}

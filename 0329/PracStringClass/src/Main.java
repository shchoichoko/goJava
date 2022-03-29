
public class Main {

	public static void main(String[] args) {
		String text = "Hello,hi,";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(2));
		System.out.println("===================");
		
		char[] c = text.toCharArray();
		System.out.println(c[0]);
		
		System.out.println(text.replace("H", "h"));
		System.out.println("===================");
		String[] t = text.split(",");
		System.out.println(t[0]);
		System.out.println(t[1]);
	}
}

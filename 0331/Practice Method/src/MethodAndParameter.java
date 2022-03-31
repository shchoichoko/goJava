
public class MethodAndParameter {

	public static void main(String[] args) {
		MethodAndParameter meth = new MethodAndParameter();
	
		meth.print("abc");
		meth.print("kim",5);
		meth.print("kim","Hong");
	}

	public void print(String text,int a) {
		System.out.println(text+a);
	}
	public void print(String text) {
		System.out.println(text);
	}
	public void print(String text, String text2) {
		System.out.println(text+text2);
	}
}

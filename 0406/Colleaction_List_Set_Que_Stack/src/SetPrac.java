import java.util.HashSet;

public class SetPrac {

	public static void main(String[] args) {
		
		HashSet<String> name = new HashSet<String>();
		name.add("Kim");
		System.out.println(name);
		name.add("Lee");
		System.out.println(name);
		name.add("Kim");
		System.out.println(name);
		System.out.println(name.size());
		
	}

}

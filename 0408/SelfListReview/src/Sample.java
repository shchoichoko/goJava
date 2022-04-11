import java.util.ArrayList;
import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {

		ArrayList pitches = new ArrayList();
		pitches.add("123");
		pitches.add("138");
		pitches.add("135");
		pitches.add(0,"100");
		System.out.println(pitches);
		System.out.println(pitches.get(3));
		System.out.println(pitches.size());
		System.out.println(pitches.contains("138"));
		System.out.println(pitches.remove(0));
		System.out.println(pitches);
		
	}

}

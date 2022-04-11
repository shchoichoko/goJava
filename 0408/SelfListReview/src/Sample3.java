import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> pitches = new ArrayList<>(Arrays.asList("165","146","138"));
		pitches.sort(Comparator.naturalOrder());
		pitches.sort(Comparator.reverseOrder());
		System.out.println(pitches);
		
	}

}

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\Æú¸®ÅØ\\Desktop\\outout.csv");
		System.out.println(file.exists());
		if(file.exists()) {
			file.delete();
		}
		System.out.println(file.exists());
	}

}

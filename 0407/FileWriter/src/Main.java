import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Æú¸®ÅØ\\Desktop\\outout.csv",false);
		for(int i = 11; i < 20; i++) {
			String data = "Line #" + i + "\n";
			fw.write(data);
		}	
		fw.close();
		
	}

}

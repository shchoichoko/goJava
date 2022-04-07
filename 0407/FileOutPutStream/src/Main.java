import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//C:\Users\폴리텍\Desktop
public class Main {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\폴리텍\\Desktop\\output.csv");
		for(int i = 1; i < 11; i++) {
			String data = i + "," + "학생";
			output.write(data.getBytes());
		}
		output.close();
	}
}

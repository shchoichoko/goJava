import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//C:\Users\������\Desktop
public class Main {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\������\\Desktop\\output.csv");
		for(int i = 1; i < 11; i++) {
			String data = i + "," + "�л�";
			output.write(data.getBytes());
		}
		output.close();
	}
}

import java.io.File;
import java.nio.file.Files;

public class ListFiles {

	public static void main(String[] args) {

		File dir = new File("C:\\Users\\폴리텍\\Desktop\\수혁");
		File files[] = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
		
	}

}

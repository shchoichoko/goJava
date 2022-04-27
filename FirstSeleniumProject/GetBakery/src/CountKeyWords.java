import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CountKeyWords {

	public static void main(String[] args) throws IOException {

		File f1 = new File("C:\\Users\\Æú¸®ÅØ\\Desktop\\¼öÇõ\\Data\\GyeongGiKeywords.csv");
		FileReader reader = new FileReader(f1);
		BufferedReader br = new BufferedReader(reader);
		File f2 = new File("C:\\Users\\Æú¸®ÅØ\\Desktop\\¼öÇõ\\Data\\testGyeongGi.csv");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
		String readText;
		ArrayList<String> list = new ArrayList<String>();
		
		while((readText = br.readLine())!=null) {
			String[] field = readText.split(",");
			for(int i = 0; i < field.length; i++) {
				list.add(field[i]);
			}
			
		}
		Set<String> set = new HashSet<String>(list);
		for(String str : set) {
			StringBuffer s = new StringBuffer();
			s.append(str + "," + Collections.frequency(list, str));
			System.out.println(str + " : " + Collections.frequency(list, str));
			bw.write(s.toString());
			bw.newLine();
		}
		bw.close();
	}

}

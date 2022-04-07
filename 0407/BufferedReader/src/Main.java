import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	//목요일 14시 교통량 min max avg
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\\\Users\\\\폴리텍\\\\Desktop\\\\trafficvolume.csv"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		String line;
		
		while((line=reader.readLine())!=null) {
			if(line.contains(",목,")) {
				String[] trafficArray = line.split(",");
				try {
					if(trafficArray[20] != null) 
						System.out.println(trafficArray[20]);
					list.add(Integer.parseInt(trafficArray[20]));
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		int sum = 0;
		for(int i = 0; i < list.size();i++) {
			sum += list.get(i);
		}
		System.out.println(list.size());
		Collections.sort(list);
		System.out.println("MaxValue : " + list.get(0));
		Collections.reverse(list);
		System.out.println("MinValue : " + list.get(0));
		System.out.println("AVG : " + sum/list.size());
	}

}

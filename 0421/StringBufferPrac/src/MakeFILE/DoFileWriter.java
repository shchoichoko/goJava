package MakeFILE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter k41_fw = new FileWriter("D:\\KOPO\\Data\\a.txt",true);
		BufferedWriter k41_bw = new BufferedWriter(k41_fw);
		StringBuffer k41_sb = new StringBuffer();
		
		BufferedReader k41_br = new BufferedReader(new InputStreamReader(System.in));
		String k41_str = "";
		while(!(k41_str = k41_br.readLine()).startsWith("s")) {
			k41_sb.append(k41_str+"\n");
		}
		k41_br.close();
		k41_fw.write(k41_sb.toString());
		k41_fw.flush();
		k41_fw.close();
		System.out.println("저장이 완료되었습니다.");
		
		
		
	}

}

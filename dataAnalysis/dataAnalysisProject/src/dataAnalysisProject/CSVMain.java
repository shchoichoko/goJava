package dataAnalysisProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class CSVMain {

	public static void main(String[] args) {

		String readFileName = "C:/Users/������/Desktop/SooHyeok/rawData1.csv";
		String writeFileName = "C:/Users/������/Desktop/SooHyeok/rawData2.csv";
		
		CSVReader csvReader;
		try {
			csvReader = new CSVReader(new InputStreamReader(new FileInputStream(readFileName),"CP949"));
			String[] nextLine;
			while ((nextLine = csvReader.readNext()) != null) {
				System.out.println(nextLine.length + " : " + String.join("|", nextLine));
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		try {
			CSVWriter cw = new CSVWriter(new FileWriter(writeFileName));
			String[] data = {"abc", "def", "ghi"};
			cw.writeNext(data);
			cw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

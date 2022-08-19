package dataAnalysisProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXLSX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String file = "C:/Users/Æú¸®ÅØ/Desktop/SooHyeok/rawData3.xlsx";
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheet("Sheet5");
			
			for(int row = 1; row < sheet.getPhysicalNumberOfRows();row++) {
				XSSFRow rows = sheet.getRow(row);
				if(rows != null) {
					String value = "";
					int cells = rows.getPhysicalNumberOfCells();
					for( int column = 0; column <= cells; column++) {
						XSSFCell cell = rows.getCell(column);
						/*
						if(cell != null)
							switch (cell.getCellType()) {
								case Cell.CELL_TYPE_NUMERIC:
									value = cell.getNumericCellValue() + "";
									break;
								case STRING:
									value = cell.getStringCellValue() + "";
									break;
								case BLANK:
									value = cell.getCellFormula() + "";
									break;
								case ERROR:
									value = cell.getBooleanCellValue() + "";
								default:
									break;
							}
						System.out.print(value + " ");
						*/
					}
				}
				System.out.println();
			
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

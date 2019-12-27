package testng;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] excelData(String fileName) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx");

		XSSFSheet ws = wb.getSheetAt(0);

		int rowCount = ws.getLastRowNum();
		
		//int rowCount = ws.getPhysicalNumberOfRows();
		
		

		
		short cellCount = ws.getRow(0).getLastCellNum();
		 String[][] data = new String[rowCount][cellCount];
				  
		  for (int i = 1; i <= rowCount; i++) {
			  
			 
		  
			  for (int j = 0; j < cellCount; j++) {
				  
		  
				  data[i-1][j] = ws.getRow(i).getCell(j).getStringCellValue();
		  
				 
		  
			  }
		  
		  }
		 

		wb.close();
		
		return data;

	}

}

package readingexcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
	 
		
		
		//File --> Workbook --> sheets-->Rows --> Cells
		
		
		//FileInputStream  file = new FileInputStream("D:\\eclipse-workspace\\seleniumproject\\testdata\\data.xlsx");
		FileInputStream  file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		 
		//workbook.getSheetAt(0);// either we can go with index
		XSSFSheet sheet = workbook.getSheet("testdata"); // either we can go with sheet name
		
		int totalrows = sheet.getLastRowNum(); 
		int totalcell = sheet.getRow(1).getLastCellNum();
		System.out.println("Number of Rows:"+totalrows);
		System.out.println("Number of Cells:"+totalcell);
		//  
		for(int r=0; r<totalrows;r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			
			
			for(int c=0;c<totalcell;c++)
			{
				
				//XSSFCell cell = currentRow.getCell(c);
				//String value = cell.toString();
				String value = currentRow.getCell(c).toString();
				System.out.print(value   +    "                    ");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
	}

}

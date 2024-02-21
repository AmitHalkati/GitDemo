package writingintoexcel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataintoExcel {

	public static void main(String[] args) throws IOException {
		 
		//File --> Workbook --> sheets-->Rows --> Cells
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
       // XSSFCell cell = sheet.createRow(0).createCell(1);
       // cell.setCellValue("Welcome");   
		
		//instead of writing in 2 statements writing in 1 statement
		XSSFRow row1 = sheet.createRow(0);
		
        row1.createCell(0).setCellValue("Welcome");
        row1.createCell(1).setCellValue("Home"); 
        row1.createCell(2).setCellValue("Good Bye"); 
        
        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0).setCellValue("Name"); 
        row2.createCell(1).setCellValue("Hello"); 
        row2.createCell(2).setCellValue("Learning"); 
        
        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0).setCellValue("Work"); 
        row3.createCell(1).setCellValue("Comapny"); 
        row3.createCell(2).setCellValue("Location"); 
        
        //Above it will add in excel
        workbook.write(file);
        workbook.close();
        file.close();
        
        System.out.println("Writing is Done!!");
		
	}

}

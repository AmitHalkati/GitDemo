package excelDataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataProvide {

	
	@Test(dataProvider="driveTest")
	public void testCaseData(String greeting,String communication,int id)
	{
		System.out.println(greeting+communication+id);
	}
	
	@DataProvider(name="driveTest")
public Object[][] getData() throws IOException
{
		//Object[][] data= {{"hello","text","1"},{"bye","message","143"},{"solo","call","453"} };
		//return data;
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Amit\\Documents\\excelDriven.xlsx");
		XSSFWorkbook wb = new  XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		XSSFRow row = sheet.getRow(0);
		int coloumn = row.getLastCellNum();
		Object data[][] = new Object[rowCount-1][coloumn];
		for(int i=0;i<rowCount-1;i++)
		{
			row = sheet.getRow(i+1);
			for(int j=0;j<coloumn;j++)
			{
				System.out.println (row.getCell(j));
			}
		}
		return data;
		
		 
		
		
}
	
	
	
	
	
	
	
}

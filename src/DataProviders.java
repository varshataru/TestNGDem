import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	@Test(dataProvider="loginDataProvider")
	public static void demo1(String uname,String pass)
	{
		System.out.println("Uname="+uname);
		System.out.println("Password="+pass);
	}
@DataProvider(name="loginDataProvider")
public static Object[][] readexcel() throws IOException {
		
		Object content[][];
		
		//File file=new File("C:\\Users\\varshataru\\Desktop");
		XSSFWorkbook book =new XSSFWorkbook("C:\\Users\\varshataru\\Desktop\\ExcelBook.xlsx");
		XSSFSheet sheet=book.getSheetAt(0);
		int lastRow=sheet.getLastRowNum();
		
		content=new Object[sheet.getLastRowNum()][sheet.getRow(1).getLastCellNum()];
		for (int i = 1; i <=lastRow; i++) {
			Row row=sheet.getRow(i);
			int lastcell=row.getLastCellNum();
			
			for (int j = 1; j < lastcell; j++) {
				Cell cell=row.getCell(j);
				switch (cell.getCellType())
				{
				
				case Cell.CELL_TYPE_NUMERIC:
					
				content[i-1][j-1]=String.valueOf(cell.getNumericCellValue());
				System.out.println(cell.getNumericCellValue());
				break;
				
				
				case Cell.CELL_TYPE_STRING:
				content[i-1][j-1]=cell.getStringCellValue();
				System.out.println(cell.getStringCellValue());
				break;
				
				
				}
				
			}
		}
		return content;
	}

}

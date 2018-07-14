package automationPractice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelRead_JExcel {
  @Test
  public void  TestReadData()
	  	{
	  	File src = new File("D:\\Personal\\Resources\\Selenium\\JExcel_DataTable.xls");
	  	try {
	  		Workbook wb = Workbook.getWorkbook(src);
	  		Sheet sh1 = wb.getSheet(0);
	  		Cell c1 = sh1.getCell(0, 0);
	  		String data1 =c1.getContents();
	  		System.out.println("Sheet Sata is "+data1);
	  		
	  	} catch (BiffException e) 
	  	{
	  		e.printStackTrace();
	  	} catch (IOException e) {
	  		// TODO Auto-generated catch block
	  		e.printStackTrace();
	  	}
	  	}
	  

  }


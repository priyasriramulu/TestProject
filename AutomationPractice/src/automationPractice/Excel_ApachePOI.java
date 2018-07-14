package automationPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;


public class Excel_ApachePOI  {
	public  int cols2 ; String Celldata;
	public int j,k=0;
	Workbook wb2 = new HSSFWorkbook();
	Sheet sh2 = wb2.createSheet("Output");
  @Test
  public void f()  throws NullPointerException, IOException
  {
	  File src = new File("D:\\Personal\\Resources\\Selenium\\POI_DataTable.xls");
	  
	  try {
	  FileInputStream FIS = new FileInputStream(src);
	  HSSFWorkbook wb = new HSSFWorkbook(FIS);
	  HSSFSheet sh1 = wb.getSheetAt(0);
	  //System.out.println("this is:"+sh1.getRow(0).getCell(0).getStringCellValue());
	 // System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
	 // System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
	 // System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	  int i = sh1.getLastRowNum();
	  System.out.println("rows :"+i);
	  
	  HSSFCell cell;
	  for (j=0;j<=i;j++)
	  {
		  //int cols = sh1.getRow(j).getPhysicalNumberOfCells();
		  //System.out.println("Am here 1");
		   cols2 = sh1.getRow(j).getLastCellNum();
		  //System.out.println("Cols :"+cols+" J : "+j);
		  //System.out.println("Cols2 :"+cols2);
		  for( k=0;k<cols2;k++)
		  {
			  //System.out.println("Am here 2");
			  
				//  String str;
				  cell =sh1.getRow(j).getCell(k);
				  //System.out.println("cell:"+cell);
				  if (cell != null)
				  {
					  System.out.println("this is:"+sh1.getRow(j).getCell(k).getStringCellValue());
					  Celldata = sh1.getRow(j).getCell(k).getStringCellValue();
					  System.out.println("Cell Data is: "+Celldata);
					  System.out.println("row : "+j+"Col : "+k);
					  writeexcel(Celldata, sh2,j,k);
				  }
		  }
		  
	  }
	  
	  FileOutputStream FOS = new FileOutputStream("D:\\Personal\\Resources\\Selenium\\Dataoutput.xlsx");
	  wb2.write(FOS);
	  FOS.close();
	
	 wb.close();
	  }catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
	  
	  private void writeexcel(String Cellvalue, Sheet sh2 , int j , int k) throws FileNotFoundException
	  {
		//Creating Cells
		
			Row HeaderRow = sh2.createRow(j);
			Cell cell = HeaderRow.createCell(k);
			cell.setCellValue(Cellvalue);
		
		
	 	} 
	  
}
  
  


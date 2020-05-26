package com.wbl.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {

static Logger log=LogManager.getLogger(ExcelHelper.class);
	
	public static Object[][] gettData(String fileName,String sheetName)
{
	Object[][] data=null;
	XSSFWorkbook wb=null;
	try {
		
     File src=new File("C:\\neeru\\workspace\\NewAutomation\\newWork.xlsx");
    //   File src=new File("C:\\neeru\\workspace\\NewAutomation\\dataGet.xlsx");
	    FileInputStream fis=new FileInputStream(src);
	    
	 wb=new XSSFWorkbook(fis);
	
	 XSSFSheet sheet=wb.getSheet(sheetName);
	 int rowIndex=sheet.getLastRowNum();
	 
	 log.info("total no. of rows are:" + rowIndex);
	 
	   data=new Object[rowIndex][];
	   
	    for(int i=1;i<=rowIndex;i++)
	    {
	     XSSFRow row=sheet.getRow(i);
	     System.out.println("row" +row);
	     int cols=row.getLastCellNum();
	     log.info("total number of columns:"+ cols );
	     Object[] colData=new Object[cols];
	     for(int j=0;j<cols;j++)
	     {
	    	 colData[j]=row.getCell(j).toString();
	         log.info("columns" +colData[j]);
	     
	     
	     }
	    data[i-1]=colData;
	    
	} 
	}catch(IOException e)	
	{
		log.error("ExcelHelper excetion: " +e);
		
	}finally
	{
		try
		{
			wb.close();
		}catch(IOException e) {
	
     
		log.error(e);
		
		
		}
	}
return data;
}
}

package com.acti.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExeclUtils 
{
	
	XSSFWorkbook excel;
	
	public ExeclUtils(String xlpath) throws Exception 
	{
		try {
			File file = new File (xlpath);
			FileInputStream fis = new FileInputStream(file);
			excel = new XSSFWorkbook(fis);
		
		}
		catch (Exception e) 
		{
			System.out.println("Excelsheet not found" +e.getMessage());
		}
		
	}

	public int GetCountMethod(int sheetnum)
	{
		 int count = excel.getSheetAt(sheetnum).getLastRowNum()+1;
		 return count;
	}
	
	public int GetCountcol(int sheetnum, int rownum)
	{
		int countcol = excel.getSheetAt(sheetnum).getRow(rownum).getLastCellNum();
		return countcol;
	}
	
	
	//getting data like each row and column values from the particular sheet
	public String GetCellData(int sheetnum, int row, int col)
	{
		String data = excel.getSheetAt(sheetnum).getRow(row).getCell(col).toString();
		return data;
		
	}

}

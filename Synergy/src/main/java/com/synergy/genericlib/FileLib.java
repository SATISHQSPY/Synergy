package com.synergy.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	
	public String readPropertyData(String propertyPath, String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(propertyPath);
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key, "Incorrect Key");
	}
	
	//public String readExcelData(String excelPath, String sheet, int row, int cell) throws Throwable
	//{
//		FileInputStream fis=new FileInputStream(excelPath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheet);
//		Row r = sh.getRow(row);
//		Cell c = r.getCell(cell);
//		String val = c.toString();
//		return val;
	//}
	
	public void writeExcelData(String excelPath, String sheet, int row, int cell, String data) throws Throwable
	{
//		FileInputStream fis=new FileInputStream(excelPath);
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet(sheet);
//		Row r = sh.getRow(row);
//		Cell c = r.createCell(cell);
//		c.setCellValue(data);
//		
//		FileOutputStream fos=new FileOutputStream(excelPath);
//		wb.write(fos);
	}
}

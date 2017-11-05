package com.test.automation.TestProject.ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Reader {

	public FileOutputStream fos;
	public String path; //path of excel sheet
	public FileInputStream fis;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow rows;
	public XSSFCell cell;
//Constructor -->
	public Excel_Reader(String path){ 
		this.path = path; //this is local ariable.
	
		try {
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
			
	
	}
	
	
//Method to return 2 D objects
	
	@SuppressWarnings("deprecation")
	public String[][] getDataFromSheet(String sheetName, String excelName){
		String dataSets[][] = null;
		try{
		sheet= workbook.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum()+1; //This will give active number of rows. Which has records. +1 is added coz loop would start from 1.
		int colcount = sheet.getRow(0).getLastCellNum(); //Column at 0th row. To count the number of columns.
		dataSets = new String[rowcount-1][colcount]; //rowcount-1 is to exclude the header
		
		for(int i=1;i<rowcount;i++){
			rows= sheet.getRow(i);
			for(int j=0;j<colcount;j++){
				cell=rows.getCell(j);
				if(cell.getCellType() == cell.CELL_TYPE_STRING)
					dataSets[i - 1][j]=cell.getStringCellValue();
				else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC){
					String cellText =String.valueOf(cell.getNumericCellValue());
					dataSets[i - 1][j] = cellText;
					}
				else if(cell.getCellType() == cell.CELL_TYPE_BOOLEAN)
					dataSets[i - 1][j]=String.valueOf(cell.getBooleanCellValue());
					
			}
		}
		return dataSets;
		}
	
		catch(Exception e){
			System.out.println("");	
			e.printStackTrace();
		}
		return dataSets;
	}
	
	//To read a particular cell somewhere in the excel sheet-->
	
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName, int rowNum, String colName){
		try{
		int col_num =0;
		int index = workbook.getSheetIndex(sheetName);
		sheet=workbook.getSheetAt(index);
		rows=sheet.getRow(0);
		for(int i=0;i<rows.getLastCellNum();i++){
			if(rows.getCell(i).getStringCellValue().equals(colName)){
				col_num=i;
				break;
			}
		}
		rows=sheet.getRow(rowNum-1);
		cell = rows.getCell(col_num);
		if(cell.getCellType() == cell.CELL_TYPE_STRING)
			return cell.getStringCellValue();
		else if(cell.getCellType() == cell.CELL_TYPE_NUMERIC){
			String cellText =String.valueOf(cell.getNumericCellValue());
			return cellText;
			}
		else if(cell.getCellType() == cell.CELL_TYPE_BOOLEAN)
			return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e){
			e.printStackTrace();
		}
			return null;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

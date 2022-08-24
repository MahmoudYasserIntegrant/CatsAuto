package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.DataProvider;

import Setup.Base;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib extends Base {

	@DataProvider(name = "CATSLogin")
	public static Object[][] loginData() throws IOException {
		Object[][] arrayObject = getExcelData(
				
				"D:\\Local\\git\\CatsAuto\\src\\test\\java\\testdata\\TestData.xlsx",
				"CATSLogin");
		return arrayObject;
	}

	@DataProvider(name = "AgentLogin")
	public static String[][] getAgentLoginData() throws IOException {
		String[][] arrayObject = getExcelData(
				
				"D:\\Local\\git\\CatsAuto\\src\\test\\java\\testdata\\TestData.xlsx",
				"AgentLogin");
		return arrayObject;
	}
	@DataProvider(name = "Census")
	public static String[][] CensusData() throws IOException {
		String[][] arrayObject = getExcelData(
				
				"D:\\Local\\git\\CatsAuto\\src\\test\\java\\testdata\\TestData.xlsx",
				"Census");
		return arrayObject;
	}
	@DataProvider(name = "EmpQuotes")
	public static String[][] GroupQuotesData() throws IOException {
		String[][] arrayObject = getExcelData(
				
				"D:\\Local\\git\\CatsAuto\\src\\test\\java\\testdata\\TestData.xlsx",
				"EmpQuotes");
		return arrayObject;
	}

	public static String[][] getExcelData(String fileName, String sheetName) throws IOException {

		FileInputStream fs = new FileInputStream(fileName);
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet(sheetName);
		
		int totalNoOfCols = sh.getRow(0).getLastCellNum();
		int totalNoOfRows = sh.getLastRowNum()+1;
		String[][] data = new String[(totalNoOfRows - 1)][totalNoOfCols];
		// Loop through all rows in the sheet
		// Start at row 1 as row 0 is our header row
		int k = 0;
		for (int i = 1; i <= totalNoOfRows -1 ; i++) {
			XSSFRow row = sh.getRow(i);
			for (int j = 0; j < totalNoOfCols; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cellToString(cell);
				data[k][j] = value;
			}
			k++;
		}
		
		return data;
		
		

	}

	@SuppressWarnings("deprecation")
	public static String cellToString(XSSFCell cell) {
		// TODO Auto-generated method stub
		Object result;
		switch (cell.getCellType()) {

		case Cell.CELL_TYPE_NUMERIC:
			result = cell.getNumericCellValue();
			break;

		case Cell.CELL_TYPE_STRING:
			result = cell.getStringCellValue();
			break;

		case Cell.CELL_TYPE_BOOLEAN:
			result = cell.getBooleanCellValue();
			break;

		case Cell.CELL_TYPE_FORMULA:
			result = cell.getCellFormula();
			break;

		default:
			throw new RuntimeException("Unknown Cell Type");
		}

		return result.toString();
	}


}

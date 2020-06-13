package com.hom.excelPOI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public String filepath;
	public static XSSFWorkbook workbook;
	public static XSSFSheet worksheet;

	public ExcelUtil(String filepath, String Sheet) throws IOException {
		this.filepath = filepath;
		workbook = new XSSFWorkbook(filepath);
		worksheet = workbook.getSheet(Sheet);
	}

	
	
	public static List<HashMap<String, String>> ReadExcel() {
		int numCols = 0;
		int numRows = 0;
		String rowvalue = null;
		String rowheader = null;
		List<HashMap<String, String>> excelData = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> rowData;
		numRows = worksheet.getPhysicalNumberOfRows();

		for (int i = 1; i < numRows; i++) {
			Row row = worksheet.getRow(i);
			numCols = row.getPhysicalNumberOfCells();
			rowData = new HashMap<String, String>();
			for (int j = 0; j < numCols; j++) {
				rowheader = worksheet.getRow(0).getCell(j).getStringCellValue();
				rowvalue = row.getCell(j).getStringCellValue();
				rowData.put(rowheader, rowvalue);
			}
			excelData.add(rowData);

		}

		return excelData;
	}

	
	public static void main(String[] args) throws IOException {
		ExcelUtil excel = new ExcelUtil("Dummy.xlsx", "APIData");
		System.out.println(excel.ReadExcel());;
	}

}

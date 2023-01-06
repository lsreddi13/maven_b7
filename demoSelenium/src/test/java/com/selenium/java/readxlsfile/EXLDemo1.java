package com.selenium.java.readxlsfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class EXLDemo1 {

//	public static void main(String[] args) {

//	}
	public static Object[][] getTestData(String sheetName, String filePath) {
//		String filePath = "C:\\Users\\sasid\\Desktop\\data.xlsx";
		Object[][] data = null;
		List s = new ArrayList();
		try {
			FileInputStream file = new FileInputStream(filePath);

			Workbook wbook = null;
			try {
				wbook = WorkbookFactory.create(file);
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Sheet sheet = wbook.getSheet("sheet1");

			data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			System.out.println(sheet.getLastRowNum() + " : " + sheet.getRow(0).getLastCellNum());

			for (int i = 0; i < sheet.getLastRowNum(); i++) {
//				Row currentRow = sheet.getRow(i);
				for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
					data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
					s.add(data);
				}

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);

		return data;
	}
}

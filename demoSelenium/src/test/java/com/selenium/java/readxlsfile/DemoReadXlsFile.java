package com.selenium.java.readxlsfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoReadXlsFile {
//	static Workbook book;
//	static Sheet sheet;

	public static Object[][] getData() throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(
				"E:\\automationworkspace\\demoSelenium\\src\\test\\java\\testdata\\logintestdata.xlsx");

		Workbook book = WorkbookFactory.create(file);

		Sheet sheet = book.getSheet("login");
		List s = new ArrayList();
		System.out.println("Number of rows : " + sheet.getLastRowNum());

		System.out.println("Number of Columns : " + sheet.getRow(0).getLastCellNum());
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				System.out.println(sheet.getRow(i + 1).getCell(j).toString());

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();

			}
			System.out.println("++++++++++++");

		}
		return data;

	}

}

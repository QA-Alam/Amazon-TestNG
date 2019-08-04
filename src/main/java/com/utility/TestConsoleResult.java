package com.utility;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.db.util.connect.DatabaseList;
import com.excelFactory.ExcelColumn;

public class TestConsoleResult {
	static List<String> Test_description;
	static List<String> Test_id;
	static List<String> Expected;
	static String path = "./Test cases/Amazon test cases.xlsx";
	static List<String> data = new ArrayList<>();

	public static void getConsole(String test_id, String description, String result, String actual,String status) {
		System.out.println("---------------------------------------");
		System.out.println("");
		System.out.println(String.format(
				"Test No:" + test_id +
				"\n" + "Test description: " + description + 
				"\n" + "Test Expected : " + result+
				"\n" + "Test Actual: " + actual+
				"\n" + "Test Status: " + status));
		
	}

	public static List<String> getTestResult(int test_no, String actualvalue,String status)  {

		try {
			Test_id = ExcelColumn.columnValue(path, 0);
			Test_description = ExcelColumn.columnValue(path, 1);
			Expected = ExcelColumn.columnValue(path, 2);

		} catch (Throwable e) {
			
		}
		
		TestConsoleResult.getConsole(Test_id.get(test_no), Test_description.get(test_no), 
				Expected.get(test_no),actualvalue,status );

		
		
		/*
		 * data.add(Test_id.get(test_no) + "_" + Test_description.get(test_no) + "_" +
		 * Expected.get(test_no) + "_" + actualvalue + "_" + status);
		 * 
		 * 
		 * 
		 * try { DatabaseList.amazon(Test_id.get(test_no),
		 * Test_description.get(test_no), Expected.get(test_no), actualvalue, status); }
		 * catch (SQLException e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
		
		
		return data;

	}

}

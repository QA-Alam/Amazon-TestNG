package com.excelFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcreater {

	static CreationHelper createHelper;

	public static void wtireContecnt(String path, List<String> data) {

		// FileImageOutputStream file= new FileImageOutputStream(path);
		Workbook workbook = new XSSFWorkbook();

		/*
		 * CreationHelper helps us create instances of various things like DataFormat,
		 * Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way
		 */
		createHelper = workbook.getCreationHelper();

		// Create a Sheet
		Sheet sheet = workbook.createSheet("Result");

		AtomicInteger rownumber = new AtomicInteger(sheet.getLastRowNum() + 1);

		Row headerRow = sheet.createRow(0);
		AtomicInteger colmHeader = new AtomicInteger(0);

		String[] header = { "Test_id", "Description", "Expected", "Actual", "Status" };

		Arrays.stream(header).forEach(headTitle -> {
			Cell cell = headerRow.createCell(colmHeader.getAndIncrement());

			cell.setCellValue(headTitle);

		});

		data.forEach((value) -> {

			Row row = sheet.createRow(rownumber.getAndIncrement());
			AtomicInteger colmNumber = new AtomicInteger(0);

			String[] content = { value.split("_")[0], value.split("_")[1], value.split("_")[2], value.split("_")[3],
					value.split("_")[4]

			};

			Arrays.stream(content).forEach(allValue -> {
				Cell cell = row.createCell(colmNumber.getAndIncrement());
			//	CellStyle style = workbook.createCellStyle(); // Create new style
				//style.setWrapText(true); // Set wordwrap
			//	cell.setCellStyle(style); // Apply style to cell
			cell.setCellValue(allValue);

			});

		});

		// Resize all columns to fit the content size

		for (int i = 0; i < 3; i++) {
			sheet.autoSizeColumn(i);

		}

		try {
			// Write the output to a file
			FileOutputStream fileOut = new FileOutputStream(path);

			workbook.write(fileOut);
			fileOut.close();
			// Closing the workbook
			workbook.close();
		} catch (IOException e) {

		}

	}

}

package org.toolsqa.utils;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private static final String TEST_DATA_FILE = "src/test/resources/TestData.xlsx";

    public static Object[][] getLoginData(String s, String loginData) throws IOException {
        FileInputStream file = new FileInputStream(TEST_DATA_FILE);
        /*Workbook workbook = new XSSFWorkbook(file) {
        };*/
        HSSFWorkbook workbook = new HSSFWorkbook();
        Sheet sheet = workbook.getSheet("LoginData");

        int rowCount = sheet.getLastRowNum();
        int columnCount = sheet.getRow(0).getLastCellNum();

        Object[][] data = new Object[rowCount][columnCount];

        DataFormatter formatter = new DataFormatter();
        for (int i = 1; i <= rowCount; i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                Cell cell = row.getCell(j);
                data[i - 1][j] = formatter.formatCellValue(cell);
            }
        }

        workbook.close();
        return data;
    }
}

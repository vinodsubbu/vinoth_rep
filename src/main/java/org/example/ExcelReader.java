package org.example;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static String getData(String filePath, String sheetName, int rowNum, int colNum) throws IOException {
        String cell = null;

        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook wb = new XSSFWorkbook(fis);
            Sheet sheet = wb.getSheet(sheetName);
            Row row = sheet.getRow(rowNum);
            Cell col = row.getCell(colNum);
            cell = col.getStringCellValue();
            wb.close();
            fis.close();
        }
        catch (Exception e){
    e.printStackTrace();
        }

        return cell;

    }
}

package helper.utils;

import helper.constants.FrameworkConstants;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtils {

    public Object[][] getExcelData(String sheetName){
        Object[][]data=null;
        try {
            FileInputStream fis=new FileInputStream(FrameworkConstants.getExcelFile());
            XSSFWorkbook book=new XSSFWorkbook(fis);
            XSSFSheet sheet=book.getSheet(sheetName);
            int row=sheet.getLastRowNum();
            int col=sheet.getRow(0).getLastCellNum();
            data=new Object[row][col];
            for (int i = 1; i <= row; i++) {
                for (int j = 0; j < col; j++) {
                    data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
                }
            }
            fis.close();book.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return data;
    }

    @DataProvider(name = "loginData")
    public synchronized Object[][]getLoginData(){
        Object[][]data =getExcelData("login");
        return data;
    }
}

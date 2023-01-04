package UtilsPackage;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class Utils {
    public Utils() {
        super();
    }

    public static long PAGE_LOAD_TIMEOUT = 80;
    public static long IMPLICIT_WAIT = 30;

    public static Object[][] getExcelData(String fileName, String sheetName) {
        Object[][] data = null;
        XSSFWorkbook wb = null;
        try {
            wb = new XSSFWorkbook("C:\\Users\\Sampath Velupula\\IdeaProjects\\DatadrivenFramework\\" +
                    "src\\main\\java\\ConfigPropertiesPackage\\Config.Properties");
            XSSFSheet sheet = wb.getSheet(sheetName);
            int rowsIndex = sheet.getLastRowNum();  //return last row number ie, how many data sets we want to run-row index starts from 0, so last row no is 4
            data = new Object[rowsIndex][];
            //this loop is to enter into each row
            for (int i = 1; i <= rowsIndex; i++) {   //we are not accessing row 0 as it is the heading
                XSSFRow row = sheet.getRow(i);
                int cols = row.getLastCellNum();   //returns no:of columns- index start from 0

                Object[] colData = new Object[cols];
                //this loop is to enter into each cell
                for (int j = 0; j < cols; j++) {
                    colData[j] = row.getCell(j).toString();
                }
                data[i - 1] = colData;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}
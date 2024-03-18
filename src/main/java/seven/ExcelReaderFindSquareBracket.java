package seven;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Dreamer-1
 * Date: 2019-03-01
 * Time: 10:21
 * Description: 读取Excel内容
 */
public class ExcelReaderFindSquareBracket {


    private static final String XLS = "xls";
    private static final String XLSX = "xlsx";


    /**
     * 根据文件后缀名类型获取对应的工作簿对象
     *
     * @param inputStream 读取文件的输入流
     * @param fileType    文件后缀名类型（xls或xlsx）
     * @return 包含文件数据的工作簿对象
     * @throws IOException
     */
    public static Workbook getWorkbook(InputStream inputStream, String fileType) throws IOException {
        Workbook workbook = null;
        if (fileType.equalsIgnoreCase(XLS)) {
            workbook = new HSSFWorkbook(inputStream);
        } else if (fileType.equalsIgnoreCase(XLSX)) {
            workbook = new XSSFWorkbook(inputStream);
        }
        return workbook;
    }


    /**
     * 解析Excel数据
     *
     * @param workbook Excel工作簿对象
     * @return 解析结果
     */
    private static void parseExcel(Workbook workbook) {
        Sheet sheet = workbook.getSheetAt(0);

        List<String> finds = new ArrayList<>();
        List<String> names = new ArrayList<>();
        int rowEnd = sheet.getPhysicalNumberOfRows();
        for (int rowNum = 0; rowNum < rowEnd; rowNum++) {
            Row row = sheet.getRow(rowNum);
            Cell data = row.getCell(5);
            String stringCellValue = data.getStringCellValue();
            String find = stringCellValue.substring(stringCellValue.indexOf("[")+1,stringCellValue.indexOf("]"));
            System.out.println(find);
        }

    }

    /**
     * 将单元格内容转换为字符串
     *
     * @param cell
     * @return
     */
    private static String convertCellValueToString(Cell cell) {
        if (cell == null) {
            return null;
        }
        String returnValue = null;
        returnValue = cell.getStringCellValue();

        return returnValue;
    }

    public static void main(String[] args) throws Exception {
        InputStream inputStream = new FileInputStream("D:\\work\\应用中心\\料品维护\\U9更新CBO_ItemMaster.xlsx");
        Workbook workbook = ExcelReaderFindSquareBracket.getWorkbook(inputStream, XLSX);
        parseExcel(workbook);

    }
}

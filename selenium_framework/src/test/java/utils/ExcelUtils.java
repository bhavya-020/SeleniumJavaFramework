package utils;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath , String sheetName) {
		try {
//			path = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception exp) {
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		getRowCount();
//		getCellData(1, 1);
		System.out.println("excelUitls main class running");
	}
	
	
	

	public static int getRowCount() {
		int rowCount = 0;
		
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("rowCount is : " + rowCount);

		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return rowCount;
	}
	
	public static int getColumnCount() {
		int columnCount = 0;
		try {
			columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("columnCount is : " + columnCount);

		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return columnCount;
	}

	
	
	public static int getCellIntData(int rowNum, int cellNum) {
		int cellData1 = 0;
		try {
			cellData1 = (int) sheet.getRow(rowNum).getCell(cellNum).getNumericCellValue();

//			System.out.println("cellIntData is : " + cellData1);

		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return cellData1;
	}
	
	
	
	public static String getCellStringData(int rowNum, int cellNum) {
		String cellData = null;
		try {
			cellData = sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();

//			System.out.println("cellStringData is : " + cellData);

		} catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.getStackTrace();
		}
		return cellData;
	}

}

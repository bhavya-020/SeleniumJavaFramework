package utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");

		ExcelUtils excel = new ExcelUtils(path+"/excel/DATA.xlsx", "Sheet1");
		
		excel.getCellIntData(1, 1);
		excel.getCellStringData(0, 1);
		excel.getRowCount();
		excel.getColumnCount();
		
		
	}

}

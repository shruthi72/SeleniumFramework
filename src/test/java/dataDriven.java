import org.apache.poi;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Identify Testcase column by scanning the entire 1st row
		//once column is identified then scan entire testcase column to identify TC2row
		//after you grab TC2 row pull all the data of the row and feed into test
		
		FileInputStream fis=new fileInputStream("C://Selenium Notes//apachepoi.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//Get Count of sheet need to give access
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
			{
			XSSFSheet sheet=workbook.getSheetAt(i);
			
			Iterator<Row> rows=sheet.iterator(); //sheet is collection of rows
			Row firstrow=rows.next();
			Iterator<Cell> ce.firstrow.cellIterator(); //row is collection of cells
			int k=0;
			int column=0;
			while(ce.hasNext())
			{
				Cell value=ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
				{
					column=k;
				}
				k++;
			}
			}
		}
		

	}

}

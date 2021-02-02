package MyExcelRead;

import java.io.IOException;

public class ExcelRead1 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      ExcelRead e1=new ExcelRead();
double value=e1.readData(1,0);
System.out.println(value);

	}

}

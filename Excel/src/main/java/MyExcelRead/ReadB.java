package MyExcelRead;

import java.io.IOException;

public class ReadB {
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		  ReadA e1=new ReadA();
		  
		  for(int i=0;i<2;i++)
		  {
			  for(int j=0;j<=2;j++)
			  {
		  
		  String value=e1.readData(i,j);
		  System.out.println(value);
				  System.out.println("Test message");
			 }
		 }

	}

}

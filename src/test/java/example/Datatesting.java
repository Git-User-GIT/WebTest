package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datatesting {
	
	
	@Test(dataProvider="getd")
	public void userdata(String gg) {
		
	
		System.out.println("Testid : "+gg);
	}
@DataProvider(name="getd")
	 public static Object[][] getDataFromDataprovider(){
	 return new Object[][] {
         { "Guru99", "India" },
         { "Krishna", "UK" },
         { "Rajesh", "USA" }
     };
}
}

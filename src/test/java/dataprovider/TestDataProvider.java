package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	@DataProvider
	public static Object[][] getData(Method m){
		Object[][] data=null;
		System.out.println("Method/Test=  "+m.getName());
		if(m.getName().equals("loginTest")) {
			data = new Object[1][4];
			
			data[0][0] = "mozilla";
			data[0][1] = "mamtabansal2k2@gmail.com";
			data[0][2] = "seltst123";
			data[0][3]= "English Grammar for begineers";
			
		}	/*else if(m.getName().equals("deleteUser")) {
			
		}*/
		return data;
	
		
	}


}

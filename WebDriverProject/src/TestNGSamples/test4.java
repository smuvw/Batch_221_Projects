package TestNGSamples;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test4 {
	
	
	@Test(dataProvider="getData")
	public void Login(String username,String Password){
		System.out.println(username+"*******"+Password);
	}
	
	
	@DataProvider
	public static Object[][] getData(){
		
		Object[][] data= new Object[3][2];
		
		data[0][0]="sri1"; //read from XLS
		data[0][1]="sri2";
		
		data[1][0]="sri3";
		data[1][1]="sri4";
		
		data[2][0]="sri5";
		data[2][1]="sri6";
		
		return data;
		
		
	}

}

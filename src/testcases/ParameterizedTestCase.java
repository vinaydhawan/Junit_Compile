package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step1
@RunWith(Parameterized.class)


public class ParameterizedTestCase {
//Step2
	public  String username;
	public  String password;
	public int pin;
//Step3
	public ParameterizedTestCase(String username,String password,int pin){
		this.username=username;
		this.password=password;
		this.pin=pin;
	}
	
//step4
	@Parameters
	public static Collection<Object[]> getData(){
		//no of rows u want to repeat the test
		// no of parameters for every test
		Object[][] data = new Object[2][3];
		//1st Row
		data[0][0]="testuser1";
		data[0][1]="password1";
		data[0][2]=1234;
		
		//1st Row
		data[1][0]="testuser1";
		data[1][1]="password1";
		data[1][2]=1234;
		
		return Arrays.asList(data);
		
	}
	
	@Test
	public void RegisterTest(){
	//	System.out.println("username");
		
		System.out.println("username is---" +username+" with password--" +password+" with pin--"+pin);
	}
	
	
	

}

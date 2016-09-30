package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestCase {
	
	//@BeforeClass // have to be static
	//@AfterClass  // have to be static class
	
	@BeforeClass
	public static void begin(){
		System.out.println("*************begining*********************");
	}
	
	@AfterClass
	public static void end(){
		System.out.println("************End*******************");
		
	}
	
	@Before
	public void OpenBrowser(){
		System.out.println("Opening browser in SecondTestCase");
	}
	
	
	@Test
	public void SendEmailTest(){
		System.out.println("Email sending code in SecondTestCase");
	}
	
	@Test
	public void SendMessageTest(){
		System.out.println("Message sending code in SecondTestCase");
	}
	
	
	@After
	public void CloseBrowser(){
		System.out.println("Close browser in SecondTestCase");
	}

	
	
	
}

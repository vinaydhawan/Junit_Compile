package testcases;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {
	
	@Test
	public void loginTest(){
		System.out.println("Testing an app");
	}
	@Test
	public void registerTest(){
		System.out.println("Registering an user ");
	}
	@Ignore
	public void DatabaseTest(){
		System.out.println("Testing the d/b ");
	}
}

package testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTestCase {
	
	@Before
	public void beforeTest(){
		System.out.println("****************");
	}

	@Test
	public void Multiplytest() {
		int Result=mMultiply(10,30);
		if (Result ==300) {
			System.out.println("Multiply logic is success");
		}else {
			System.out.println("Multiply logic is failure");		
		fail("Not yet implemented");
	}
	}
	
	@Test
	public void Addtest() {
		int Result=mAdd(10,30);
		if (Result ==400) {
			System.out.println("Add logic is success");
		}else {
			System.out.println("Add logic is failure");		
		fail("Add logic not yet implemented");
	}
	}
	
	public int mMultiply(int a,int b){
		return a*b;
		
	}
	
	public int mAdd(int a,int b){
		return a+b;
		
	}
	
}

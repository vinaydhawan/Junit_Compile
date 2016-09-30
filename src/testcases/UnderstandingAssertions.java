package testcases;

import junit.framework.Assert;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class UnderstandingAssertions {
	
	@Rule
	public ErrorCollector err=new ErrorCollector();
	
	@Test
	public void FriendListCountTest(){
		int actual_count=100;  // selenium code comes from the application
		int expected_count=1010; // comes from xls
	//-------------------------------------------------	
		//if else example
		/*if (actual_count == expected_count){
			System.out.println("Pass");
		}else {
			System.out.println("fail");
		}*/
	//------------------------------------------------
		// assertions example
		System.out.println("A");
		
		try{
		Assert.assertEquals(expected_count, actual_count);
		}catch(Throwable t){
			err.addError(t);
		}
		
		System.out.println("B");
	}
		
		@Test
		public void FriendListCount2Test(){
		try{
			Assert.assertEquals("102","102");
			}catch(Throwable t){
				err.addError(t);
			}
		}	
		
	
		
}

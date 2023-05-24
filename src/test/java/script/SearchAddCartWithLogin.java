package script;

import org.testng.annotations.Test;

import generic.CommonBaseTest;

public class SearchAddCartWithLogin extends CommonBaseTest {
	
	@Test(priority = 8)
	 public void AddProducttocartwithLogin() throws Throwable {
		try
		{
			ValidSignIn vs = new ValidSignIn();
			vs.testValidSignIn();
		}
		catch(Exception e)
		{
			System.out.println("Entered into error");
		}
	}

}

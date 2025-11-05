//logintest

package testcases;


	import java.io.IOException;

import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import base.TestBase;
	import pages.AutomationConstants;
	import pages.LoginPage;

	public class LoginTest extends TestBase {

	    LoginPage obj;
	    @BeforeClass
	    public void objinit() throws IOException
	    {
	        obj=new LoginPage(driver);
	    }
	    @Test
	    public void tc001()
	    {   
	    	obj.setUsername("Say");
	        obj.setPassword("abcd");
	        obj.setClick();
	        String err=obj.gettext();
	        Assert.assertEquals(err,AutomationConstants.loginerr);
	    }

	}
	



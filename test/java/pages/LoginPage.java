//loginpage

package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.LocatorUtility;

public class LoginPage extends LocatorUtility {
	WebDriver driver;
	
//	@FindBy(id="user-name")
//	WebElement name;
//	@FindBy(id="password")
//	WebElement pass;
	@FindBy(id="login-button")
	WebElement clickbtn;
	@FindBy(tagName="h3")
	WebElement nxt;
	
	
	public LoginPage(WebDriver driver) throws IOException {
		super();
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUsername(String uname) {
		WebElement name=driver.findElement(By.id(pro.getProperty("name")));
		name.clear();
		name.sendKeys(uname);
	}
	public void setPassword(String passw) {
		WebElement pass=driver.findElement(By.id(pro.getProperty("pass")));
		pass.clear();
		pass.sendKeys(passw);
	}
	public void setClick() {
//		WebElement clickbtn=driver.findElement(By.id("login-button"));
		clickbtn.click();
	}
	public String gettext() {
//		WebElement nxt=driver.findElement(By.tagName("h3"));
		String acterr=nxt.getText();
		return acterr;
	}

}

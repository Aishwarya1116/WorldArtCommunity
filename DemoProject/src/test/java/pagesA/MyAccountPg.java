package pagesA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbaseA.WebTestBaseA;
import utilsA.UtilityA;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPg extends WebTestBaseA{
	
	@FindBy(xpath = "//a[text()='Gifts']")
	 WebElement hover;
	
	
	@FindBy(xpath = "//*[@id=\"wrap\"]/footer/div/div[1]/div[2]/ul/li[3]/ul/li[5]/a")
	WebElement instagram;
	
	@FindBy(xpath = "//*[@id=\"wrap\"]/div[1]/section[2]/div[1]/div/div[1]/div/div/div/div/div[1]/label")
    WebElement checkBox;
	@FindBy(xpath = "//*[@id='ownmenu']/li[2]/a")
	 WebElement elementC;
	@FindBy(xpath = "//*[@id='ownmenu']/li[12]/a")
	 WebElement element1;
	@FindBy(id = "searchFieldVal")
	 WebElement element2;
	
	

	public MyAccountPg() {	
		PageFactory.initElements(driver,this);
	}
	
	 public void mouseHover(){
	       UtilityA.mouseHover(driver,hover);
	    }
	 
	 public void scrollDownMethod() {
	        UtilityA.scrollDownByElement(driver, instagram);
	        instagram.click();

	    }
	 public void windowHandle(){
	        UtilityA.scrollDownByElement(driver, instagram);
	        instagram.click();
	        UtilityA.switchToWindows(driver);
	    }
	 
	 public void checkincheckBox(){
		    hover.click(); 
		    checkBox.click();
	    }
	 
	 public void getCookiesHandle(){
	        UtilityA.getCookies();
	    }
	 
	 public void sort() throws InterruptedException {
		elementC.click();
		Thread.sleep(1000);
		
	WebElement eleclick1=driver.findElement(By.xpath("//*[@id='shortByFilter']"));
	Select s=new Select(eleclick1);
	s.selectByVisibleText("Unsorted");
		
		 
	 }
	 public void search1() throws InterruptedException {
		 element1.click();
		 Thread.sleep(2000);
			
			driver.findElement(By.id("searchFieldVal")).sendKeys("gifts",Keys.ENTER);
		 
	 }
	 
}
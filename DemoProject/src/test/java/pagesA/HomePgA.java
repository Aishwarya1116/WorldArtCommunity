package pagesA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;


import testbaseA.WebTestBaseA;

public class HomePgA extends WebTestBaseA{
	@FindBy(xpath = "//*//a[text()='USER LOGIN']")
    WebElement usersearch;

    public HomePgA(){
        PageFactory.initElements(driver,this);
    }

    public void userSearchClick(){
        usersearch.click();
    }

    public void mouseOvering() {
    
    	for(int i=2;i<=10;i++)
		{
			Actions  act=new Actions(driver);
			WebElement ele=driver.findElement(By.xpath("//*[@id=\"ownmenu\"]/li["+i+"]/a"));
			act.moveToElement(ele).perform();
		}
    	
    }
    public void search() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)", "");
    	
    }
    	
    }

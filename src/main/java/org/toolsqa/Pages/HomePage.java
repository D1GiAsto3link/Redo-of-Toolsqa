package org.toolsqa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
        driver.manage().window().maximize();
        BasePage BASE = new BasePage(driver);
        BASE.captureScreenshot();
    }

    // Add more methods specific to the home page if needed
public void NavmenuAcc(){
    try{
        driver.findElement(new By.ByLinkText("My Account")).click();

    }
    catch(Exception e){
        e.printStackTrace();
    }
}


}

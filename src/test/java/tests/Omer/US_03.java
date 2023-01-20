package tests.Omer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import qdPages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ObjectInputFilter;

public class US_03 {

    LoginPage loginPage=new LoginPage();
    @Test
    public void test01(){
        //US-03 TC_01 facebook iconun gorunurluk testi
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        loginPage.cookiesAccept.click();
        WebElement pagedown= Driver.getDriver().findElement(By.xpath("//button[text()='Search ']"));
        pagedown.sendKeys(Keys.END);
        Assert.assertTrue(loginPage.facebookIcon.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test02(){
        //US-03 TC_02 twitter iconun gorunurluk testi
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        ReusableMethods.bekle(5);
        loginPage.cookiesAccept.click();
        WebElement pagedown= Driver.getDriver().findElement(By.xpath("//button[text()='Search ']"));
        pagedown.sendKeys(Keys.END);
        ReusableMethods.bekle(5);
        Assert.assertTrue(loginPage.twitterIcon.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void test03(){
        //US-03 TC_03 linkedin iconun gorunurluk testi
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        ReusableMethods.bekle(5);
        loginPage.cookiesAccept.click();
        WebElement pagedown= Driver.getDriver().findElement(By.xpath("//button[text()='Search ']"));
        pagedown.sendKeys(Keys.END);
        ReusableMethods.bekle(5);
        Assert.assertTrue(loginPage.linkedinIcon.isDisplayed());
        Driver.closeDriver();
    }




}

package tests.Omer;

import com.beust.ah.A;
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
    }
    @Test
    public void test02(){
        //US-03 TC_02 twitter iconun gorunurluk testi
        ReusableMethods.bekle(5);
        Assert.assertTrue(loginPage.twitterIcon.isDisplayed());

    }
    @Test
    public void test03(){
        //US-03 TC_03 linkedin iconun gorunurluk testi
        ReusableMethods.bekle(5);
        Assert.assertTrue(loginPage.linkedinIcon.isDisplayed());

    }

    @Test
    public void test04(){
        //US-03 TC_04 facebook iconun click olma testi
        ReusableMethods.bekle(3);
        loginPage.facebookIcon.click();
        String expectedWord= "Facebook";
        String actualWord= Driver.getDriver().getTitle();
        Assert.assertTrue(actualWord.contains(expectedWord));
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().back();

    }
    @Test
    public void test05(){
        //US-03 TC_05 Twitter iconun click olma testi
        loginPage.twitterIcon.click();
        String expectedWord= "Twitter";
        String actualWord= Driver.getDriver().getTitle();
        Assert.assertTrue(actualWord.contains(expectedWord));
        ReusableMethods.bekle(3);
        Driver.getDriver().navigate().back();

    }

    @Test
    public void test06(){
        //US-03 TC_06 Linkedin iconun click olma testi
       loginPage.linkedinIcon.click();
        String expectedWord= "LinkedIn";
        String actualWord= Driver.getDriver().getTitle();
        Assert.assertTrue(actualWord.contains(expectedWord));
        ReusableMethods.bekle(3);
        Driver.closeDriver();

    }




}

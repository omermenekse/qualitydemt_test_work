package tests.Omer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import qdPages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_03 {
LoginPage loginPage=new LoginPage();
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        loginPage.cookiesAccept.click();


    }


}

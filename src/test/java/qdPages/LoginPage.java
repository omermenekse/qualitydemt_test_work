package qdPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

//mainpage/bottomleftcorner
    @FindBy(xpath = "//*[@class='fab fa-facebook-f']")
    public WebElement facebookIcon;

    //mainpage/bottomleftcorner
    @FindBy(xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterIcon;

    //mainpage/bottomleftcorner
    @FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedinIcon;

    //mainPage
    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookiesAccept;

    @FindBy(id="login-email")
    public WebElement kullaniciEmailKutusu;

    @FindBy(id="login-password")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

}

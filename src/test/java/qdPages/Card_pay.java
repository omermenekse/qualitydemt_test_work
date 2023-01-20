package qdPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Card_pay {
    public Card_pay(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@class='btn btn-buy-now active']")
    public WebElement AddtoCardButton;

    @FindBy(xpath = "//i[@class='fas fa-shopping-cart']")
    public WebElement shoopingBag;

    @FindBy(xpath = "//buttob[text()='Checkout']")
    public WebElement checkoutButton;

    @FindBy(xpath = "//div[@class='row payment-gateway stripe']")
    public WebElement stripeButton;

    @FindBy(xpath = "//button[text()='Pay with stripe']")
    public WebElement payWithStripeButton;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement payInformationEmail;

    @FindBy(xpath ="//input[@label='Kart numarası']" )
    public WebElement cardNumber;


}

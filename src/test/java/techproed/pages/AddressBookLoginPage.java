package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

//FindBy annotation comes from selenium to locate the elements

public class AddressBookLoginPage {
    //PageFactory is used for initializing the page object.it comes from selenium.
    //Ech page class should have this in the class.
    public AddressBookLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "session_email")
    public WebElement username;

    @FindBy(id = "session_password")
    public WebElement password;

    @FindBy(xpath = "//input[@name='commit']")
    public WebElement loginButton;
   
}

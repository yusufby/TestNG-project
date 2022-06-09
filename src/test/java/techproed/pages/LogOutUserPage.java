package techproed.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class LogOutUserPage {
    /*1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Signup / Login' button
5. Verify 'Login to your account' is visible
6. Enter correct email address and password
7. Click 'login' button
8. Verify that 'Logged in as username' is visible
9. Click 'Logout' button
10. Verify that user is navigated to login page*/
public LogOutUserPage(){
    PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath= "(//a)[5]")
    public WebElement signUpLogin;

    @FindBy(css = "input[type='text']")
    public WebElement name;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailAddress;

    @FindBy(xpath= "(//button[@type='submit'])[2]")
    public WebElement signUpButton;








}

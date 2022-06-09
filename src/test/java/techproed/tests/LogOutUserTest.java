package techproed.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.LogOutUserPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class LogOutUserTest {
    LogOutUserPage logOutUserPage=new LogOutUserPage();

    public LogOutUserTest(){

    }

    @Test
    public void logOutUserTest(){
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Home"));
        logOutUserPage.signUpLogin.click();
        logOutUserPage.name.sendKeys(Faker.instance().name().name());
        logOutUserPage.emailAddress.sendKeys(Faker.instance().internet().emailAddress());
        logOutUserPage.signUpButton.click();
        Assert.assertTrue(logOutUserPage.signUpButton.isDisplayed());







    }

}

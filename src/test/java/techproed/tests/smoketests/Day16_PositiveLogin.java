package techproed.tests.smoketests;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.DefaultPage;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
public class Day16_PositiveLogin {
    HomePage homePage;
    LoginPage loginPage;
    DefaultPage defaultPage;

    @Test(groups = "smoke-group-1")
    public void adminLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        loginPage.loginButton.click();
//        Verification
        Assert.assertTrue(defaultPage.userID.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void customerLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("customer_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        loginPage.loginButton.click();
//        Verification
        Assert.assertTrue(defaultPage.userID.isDisplayed());
        Driver.closeDriver();
    }
}
/*Parallel testing ?*/
//we use testNG xml files to do parallel testing
//parallel: for running in parallel
//thread-count(execution flow): number of thread to run in parallel testing
// is done for reducing the execution time
//it is especially used when running multiples tests that takes long time
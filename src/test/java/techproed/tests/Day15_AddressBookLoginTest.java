package techproed.tests;

import org.testng.annotations.Test;
import techproed.pages.AddressBookLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day15_AddressBookLoginTest {
    //Page object
    AddressBookLoginPage addressBookLoginPage = new AddressBookLoginPage();

    @Test(groups = "smoke-group-1") //(groups = "smoke-group-1") use this group to run specific methods
    public void loginTest() {
        Driver.getDriver().get(ConfigReader.getProperty("address_url"));
        // addressBookLoginPage.username.sendKeys("testtechproed@gmail.com");
        //addressBookLoginPage.password.sendKeys("Test1234!");
        addressBookLoginPage.username.sendKeys(ConfigReader.getProperty("address_username"));
        addressBookLoginPage.password.sendKeys(ConfigReader.getProperty("address_pass"));

        addressBookLoginPage.loginButton.click();

        Driver.closeDriver();
    }
}

package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day_15FirstConfigTest {
/*PAGE OBJECT MODEL */
    //Maintaining automation framework
    //it will be easier to debug
    //Page oject design is an automation framework design for testing applications to reduce the challenges
    //it make it possible to reuse objects, classes, methods , data and so on. testers do less work with it
    //anything you can locate is object in the website

    @Test
    public void firstConfigTest() {
        //Driver.getDriver().get("https://www.techproeducation.com");       //hard code
        Driver.getDriver().get(ConfigReader.getProperty("techproed_url"));
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.getDriver().get(ConfigReader.getProperty("address_abay"));
        Driver.closeDriver();

    }
}

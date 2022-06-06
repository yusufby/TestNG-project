package techproed.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    //    create a private static WebDriver object
    private static WebDriver driver;
    private Driver(){
    }
    //    create getDriver method to create and initiate the driver instance
    public static WebDriver getDriver(){
        if (driver==null){//driver is not pointing chromedriver, firefoxdriver, edgedriver,....
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    //    create a closeDriver method to close the driver
    public static void closeDriver(){

//        quit the driver id it is pointing chromedriver, firefoxdriver, edgedriver,....
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }

}

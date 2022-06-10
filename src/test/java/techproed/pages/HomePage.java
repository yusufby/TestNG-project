package techproed.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class HomePage {
    //homepage constructor
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Login")
    public WebElement homeLoginButton;
}
/*DATA PROVIDER*/
//Annotation of TestNG
//it is used to provide data to the test cases
//the return type is 20 array




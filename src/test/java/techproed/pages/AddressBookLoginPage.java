package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;


//FindBy annotation comes from selenium to locate the elements


/*What is page object model with example?*/
//Page Object Model, also known as POM, is a design pattern in Selenium
// that creates an object repository for storing all web elements.
// It is useful in reducing code duplication and improves test case maintenance.
//In Page Object Model, consider each web page of an application as a class file

/*What is smoke test?*/
//is done to make sure the application is up and running
/*Testing critical functionalities */
//login
//checkin
//checkout
//add to card
//make payment
//sign out

/*How often smoke testing is done ?*/
//everyday in early morning at 08:00

/*How long does your smoke test takes to execute?*/
//not too much . about 15-20 minutes

/*How do you do smoke testing ? */
//should be automated.
//we have a smoke test  suite in our automation framework. we run it every morning

/*How many test cases are there in your smoke test suite? */
//about 20 test cases.
/*Does all of your smokes test cases automated?*/
//Yes we automated all smoke test cases.

/*Who decides the smoke test?*/
//Test lead.

/*REGRESSION ?*/
//It means we run all major functionalities.
//this is a comprehensive testing
//Smoke test + Log in with different use profiles + making payment with
// different payment system + creating new user profiles

/*How often do you do regression testing ?*/
//after major bugs,and before major releases.
//when a new feature is added.(after adding a few new features , test the application as a whole)
//we have release every 6 months, before each release we do regression

/*How long does your regression take?*/
//We have a regression suite. The automation of regression suite takes around 4-5 hours.

/*How dou do regression testing?*/
//we have a regression test suite in our automation framework. We run is during regression testing.

/*How many test cases are there in your regression test suite?*/
//there are about 500 test cases in our regression suite

/*Does all of your test cases are automated?*/
// almost of all of them automated. There might be a few that need manual intervention that we did
//not automate.but i can say that more than 90 percent of our regression tests cases are automated
/*Stories that I can not automate*/
// we had some stories that is high level security.tech lead tests them because he has access.
//We have some manual intervention required on some stories, that can not be automated.

/*Who decides the regression test?*/
//Test lead

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

package techproed.tests.dataprovider;
import org.testng.annotations.*;
public class Day18_DataProvider1 {
    /*
     * DATA PROVIDER: is used to get list of data in TestNG
     * 1. create a method
     * 2. use @DataProvider annotation
     * 2. add data
     *
     * How to pass the data from a method to test method with data provider?
     * -Use dataProvider in the Test method and set uit to equal to method name
     *
     * We can give alternative name using name ="alternative name"
     *
     * */
//GET THE DATA FROM 2D ARRAY. THE BASIC ONE
    @DataProvider(name = "customer-login-data")
    public Object[][] dataProviderMethod(){

        Object[][] customerCredentials ={  //2 dimensional array
                {"customer@bluerentalcars.com","12345"},
                {"customer1@bluerentalcars.com","12346"},
                {"customer2@bluerental cars.com","12347"},
                {"customer3@bluerentalcars.com","12348"}
        };
        return customerCredentials;
    }

    @Test(dataProvider = "customer-login-data")
    public void customerLoginInfo(String username, String password){
        System.out.println("Username : "+username+" | Password : "+password);
    }
}

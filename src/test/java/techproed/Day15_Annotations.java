package techproed;

import org.testng.annotations.*;

        //WebDriverManager is used to set up driver for chrome , firefox and so on.
        //testNG: @test, @before, Assert,Data Provider...
        //selenium java : dropdown, click , sendkey, actions , alert.
        //suite > test groups > Groups > class > methods

public class Day15_Annotations {

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method");
    }

    @Test(priority = 2)
    public void ztest1() {
        System.out.println("Test 1");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("Test 2");
    }

    @Test(enabled = false)
    public void test3() {
        System.out.println("Test 3");
    }

    @Test
    @Ignore
    public void test4() {
        System.out.println("Test 4");
    }

    @Test(priority = -3)
    public void atest5() {
        System.out.println("Test 5");
    }


//    Below test cases do not have priority, then they will run in alphabetical order
//    When a test case do not have priority, then priority = 0 by default
//    Tests that has same priority run in alphabetical order

//    a) 6>7>5>2>1
//    b) 5>2>1>6>7
//    c) 5>6>7>2>1 ANSWER!!!!!!!

    //@Test(priority = 0)
    @Test
    public void test6() {
        System.out.println("Test 6");
    }

    //@Test(priority = 0)
    @Test
    public void test7() {
        System.out.println("Test 7");
    }

    /*
     * @Test : creates test case/method
     * @BeforeMethod: Same as @BeforeMethod in JUNIT.
     * Runs before each method. Runs after each @TEST annotation
     * @AfterMethod : Same as @AfterMethod in JUNIT.
     * Runs after each method. Runs after each @Test annotation
     * @Ignore : To skip a test case
     * @Test(enabled = false) : to disable a test case. Similar to Ignore
     * @Test(priority = 1) : priority is used for running tests in specific order.
     * By default, testNG runs in alphabetical order
     * */

    /*PAGE OBJECT MODEL :POM */
    //
}
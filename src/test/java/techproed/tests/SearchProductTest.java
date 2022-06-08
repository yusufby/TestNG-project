package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.SearchProductPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class SearchProductTest {
    SearchProductPage searchProductPage = new SearchProductPage();
    public SearchProductTest() {
    }
    @Test
    public void searchProductsTest() {
        Driver.getDriver().get(ConfigReader.getProperty("automation_exercise_url"));
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "https://www.automationexercise.com/");
        this.searchProductPage.product.click();
        Assert.assertTrue(searchProductPage.allProducts.isDisplayed());
        searchProductPage.searchBox.sendKeys("Blue Top");
        searchProductPage.searchButton.click();
        Assert.assertTrue(searchProductPage.searchedProductsText.isDisplayed());
        searchProductPage.viewProduct.click();
        Assert.assertTrue(searchProductPage.blueTopName.isDisplayed());
        Assert.assertTrue(searchProductPage.category.getText().contains("Women"));
        Assert.assertEquals(searchProductPage.brand_polo.getText(), "Brand: Polo");
    }
}

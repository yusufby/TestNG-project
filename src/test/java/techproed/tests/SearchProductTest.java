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
        Assert.assertTrue(this.searchProductPage.allProducts.isDisplayed());
        this.searchProductPage.searchBox.sendKeys(new CharSequence[]{"Blue Top"});
        this.searchProductPage.searchButton.click();
        Assert.assertTrue(this.searchProductPage.searchedProductsText.isDisplayed());
        this.searchProductPage.viewProduct.click();
        Assert.assertTrue(this.searchProductPage.blueTopName.isDisplayed());
        Assert.assertTrue(this.searchProductPage.category.getText().contains("Women"));
        Assert.assertEquals(this.searchProductPage.brand_polo.getText(), "Brand: Polo");
    }
}

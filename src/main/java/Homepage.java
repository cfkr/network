import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

public class Homepage extends BasePage {

    SearchBox searchBox;
    By cartCountLocator = By.className("header__basket--count");
    By cartContainerLocator = By.className("header__icon -shoppingBag");

    By cartShoppingPage =By.className("button -primary header__basket--checkout header__basketModal -checkout");


    public Homepage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0 ;
    }

    public void goToCart() {
    click(cartContainerLocator);
    click(cartShoppingPage);


    }

    private int getCartCount(){
      String count =  find(cartCountLocator).getText();
        return Integer.getInteger(count);

    }
}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_To_Cart {

    Homepage homaPage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    public void search_a_product() {
        homaPage.searchBox().search("Ceket");
        Assertions.assertTrue(productsPage.isOnProductsPage(), "Not on the page!");
    }

    @Test
    public void select_a_product(){
    productsPage.selectProduct(2);
    Assertions.assertTrue(productDetailPage.isOnProductDetailPage()
    ,"Not on product detail page!");
    }

    @Test
    public void add_product_to_cart(){
    productDetailPage.addToCart();
    Assertions.assertTrue(homaPage.isProductCountUp(),
            "Product Count did not increase!");
    }

    @Test
    public void go_to_cart(){
        homaPage.goToCart();
        Assertions.assertTrue(cartPage.checkIfProductAdded(),
           "Product was not add to cart!" ) ;   }


}

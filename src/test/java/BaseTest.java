import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @BeforeAll
    public static  void setUp() {
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.network.com.tr/");
        driver.manage().window().maximize();
    }
    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}

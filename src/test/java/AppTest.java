import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest {
    private String siteURL ="https://vimeo.com/";
    private String projectLocation = System.getProperty("user.dir");
    private WebDriver driver;

    @BeforeClass
    public void setup(){
        //If geckodriver not defined on system path uncomment bellow part and navigate to exact location of geckodriver.exe file
        /*
         System.setProperty("webdriver.gecko.driver", projectLocation +"\\lib\\geckodriver\\geckodriver.exe");
         System.setProperty("webdriver.firefox.bin","path to geckodriver.exe");
         */
        driver = new FirefoxDriver();
    }

    @Test
    public void loadPageTest(){
        driver.get(siteURL);
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Vimeo | The world’s leading professional video platform");
        driver.quit();
    }


}

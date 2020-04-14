import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class Mytest {

    protected static WebDriver driver;
    private Logger logger = LogManager.getLogger(Mytest.class);

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logger.info("Драйвер поднят");
    }
    @Test
    public void openPage(){
        driver.get("https://otus.ru/");
        logger.info("Страница отус открыта");
    }
    @After
    public void setDown(){
        if (driver != null){
            driver.quit();
        }
    }
}

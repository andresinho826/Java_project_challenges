import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.beans.BeanProperty;
import java.time.Duration;

public class AppTest {
    static WebDriver driver;
    static String driverPath = "src/utils/chromedriver.exe";
    static String urlPageOne = "https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html";


    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(urlPageOne);
    }

    @Test
    public void test(){
        Actions actions = new Actions(driver);

        actions.sendKeys("");

        //https://app.codility.com/c/feedback/WTXMQP-8WS/
    }
}

import org.hamcrest.MatcherAssert;
import static org.hamcrest.core.Is.is;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UxCrowdTest {

    private WebDriver driver;
    private SoftAssert soft;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://lk.uxcrowd.ru/blog");
        soft = new SoftAssert();
    }

    @Test
    public void title () {

        MatcherAssert.assertThat(driver.getTitle(),is("UXCrowd блог"));
    }

    @Test
    public void backToUxCrowdBtn() {

        soft.assertEquals(driver.findElement(By.className("prev_uxc")).getText(),"ОБРАТНО В UXCROWD");
        driver.findElement(By.className("prev_uxc")).click();
        soft.assertEquals(driver.getCurrentUrl(),"https://lk.uxcrowd.ru/");
        soft.assertAll();
    }

    @Test
    public void readBtn () {

        MatcherAssert.assertThat(driver.findElement(By.className("btn_read")).getText(),is("ЧИТАТЬ"));
    }

    @Test
    public void articleHeader1 () {

        MatcherAssert.assertThat(driver.findElement(By.xpath(".//*[@ng-app='app']//div[1]//span[1]")).getText(),is("4 ПРИЧИНЫ, ПОЧЕМУ ЛЮДИ НЕ ПОЛЬЗУЮТСЯ ВАШИМ МОБИЛЬНЫМ ПРИЛОЖЕНИЕМ"));
    }

    @Test
    public void article1 () throws Exception {

        driver.findElement(By.xpath(".//*[@ng-app='app']//div[1]//span")).click();
        Thread.sleep(1000);
        soft.assertEquals(driver.findElement(By.xpath(".//*[@ng-app='app']//div[1]/div[1]/div")).getText(),"4 ПРИЧИНЫ, ПОЧЕМУ ЛЮДИ НЕ ПОЛЬЗУЮТСЯ ВАШИМ МОБИЛЬНЫМ ПРИЛОЖЕНИЕМ");
        soft.assertEquals(driver.findElement(By.xpath(".//*[@ng-app='app']//div[4]//h1")).getText(),"4 причины, почему люди не пользуются вашим мобильным приложением");
        soft.assertEquals(driver.findElement(By.linkText("Google survey data")).getAttribute("href"),"http://www.digitalinformationworld.com/2015/09/infographic-why-mobile-apps-are-being-uninstalled.html");
        soft.assertEquals(driver.findElement(By.linkText("26,8% пользователей")).getAttribute("href"),"http://www.digitalinformationworld.com/2015/09/infographic-why-mobile-apps-are-being-uninstalled.html");
        soft.assertEquals(driver.findElement(By.linkText("78% мобильных пользователей")).getAttribute("href"),"http://www.businessofapps.com/app-usage-statistics-2015/");
        soft.assertEquals(driver.findElement(By.linkText("юзабилити-тестирование")).getAttribute("href"),"https://uxcrowd.ru/");
        soft.assertAll();
    }

    @AfterMethod
    public void end (){

        driver.quit();
    }
}

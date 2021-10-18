package Tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {

    /*
    1) Yeni bir Class olusturalim. (VerifyTitle)
    2) Amazon ana sayfasina gidelim . https://www.amazon.com/
    3) Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title beklenen deger ile ayni. TEST PASS.");
        } else {
            System.out.println("Title beklenenden farkli. TEST FAILED.");
            System.out.println("Aktuel Title : " + driver.getTitle());
        }

        driver.close();
    }
}

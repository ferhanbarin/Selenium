package Tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageURL {

    /*
    1) Yeni bir class olusturalim : (VerifyURLTest)
    2) Youtube ana sayfasina gidelim. https://www.youtube.com/
    3) Sayfa URL’nin www.youtube.com oldugunu dogrulayin.
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String expectedURL = "https://www.youtube.com/";
        String actualURL = driver.getCurrentUrl();

        if (expectedURL.equals(actualURL)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.out.println("Gecerli URL : " + actualURL);
        }

        driver.close();
    }
}

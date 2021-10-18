package Tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
    1) Yeni bir class olusturalim. (Homework)
    2) ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    3) Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
    4) https://www.walmart.com/ sayfasina gidin.
    5) Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    6) Tekrar “facebook” sayfasina donun.
    7) Sayfayi yenileyin.
    8) Sayfayi tam sayfa (maximize) yapin.
    9) Browser’i kapatin.
*/
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED TITLE");
        } else {
            System.out.println("FAILED TITLE\nCorrect Title : " + actualTitle);
        }

        String expectedURL = "facebook";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("PASSED URL");
        } else {
            System.out.println("FAILED URL\nCorrect URL : " + actualURL);
        }

        driver.navigate().to("https://www.walmart.com/");

        String expectedTitleWalmart = "Walmart.com";
        String actualTitleWalmart = driver.getTitle();

        if (actualTitleWalmart.contains(expectedTitleWalmart)) {
            System.out.println("PASSED TITLE WALMART");
        } else {
            System.out.println("FAILED TITLE WALMART");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();

    }
}


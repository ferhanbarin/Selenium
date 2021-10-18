package Tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    /*
    1) Yeni bir class olusturun. (TekrarTesti)
    2) Youtube web sayfasina gidin ve sayfa baslıginin “youtube” olup olmadıgini doğrulayın (verify), eger degilse dogru basligi(Actual Title) konsolda yazdirin.
    3) Sayfa URL'sinin “youtube” icerip icermedigini (contains) dogrulayin, icermiyorsa dogru URL'yi yazdirin.
    4) Daha sonra Amazon sayfasina gidin. https://www.amazon.com/
    5) Youtube sayfasina geri dönün.
    6) RefrSayfayi yenileyin.
    7) Amazon sayfasina dönün.
    8) Sayfayi tamsayfa yapin.
    9) Ardından sayfa basliginin "Amazon" icerip icermedigini (contains) dogrulayin, Yoksa dogru basligi(Actual Title) yazdirin.
    10) Sayfa URL'sinin https://www.amazon.com/ olup olmadigini dogrulayin, degilse dogru URL'yi yazdirin.
    11) Sayfayi kapatin.
*/
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.youtube.com/");

        String expectedTitle = "youtube";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED\nCorrect Title : " + actualTitle);
        }

        String expectedURL = "youtube";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED\nCorrect URL : " + driver.getCurrentUrl());
        }

        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String expectedTitleAmazon = "Amazon";
        String actualTitleAmazon = driver.getTitle();

        if (actualTitleAmazon.contains(expectedTitleAmazon)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED\nCorrect Amazon Title : " + actualTitleAmazon);
        }

        String expectedURLAmazon = "https://www.amazon.com/";
        String actualURLAmazon = driver.getCurrentUrl();

        if (actualURLAmazon.equals(expectedURLAmazon)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED\nCorrect Amazon URL : " + actualURLAmazon);
        }

        driver.close();
    }
}


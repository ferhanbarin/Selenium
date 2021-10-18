package Tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/"); // amazon.com gider.
        System.out.println("Suandaki URL : " + driver.getCurrentUrl()); // Sayfanin URL yazdirir.
        System.out.println("Suanki Baslik" + driver.getTitle()); // Sayfanin basligini yazdirir.

        driver.manage().window().maximize(); // Sayfayi fullscreen yapar.
        Thread.sleep(3000); // Sayfayi 3 saniye acik tutar.

        driver.navigate().to("https://www.youtube.com/"); // Yukaridaki yazilan URL acdiktan sonra, yazilan siradaki URL'yi acar.
        driver.navigate().back(); // Acilan 2. URL'den sonra (youtube.com) yazilan ilk URL (amazon.com) döner.
        driver.navigate().forward(); // Yazilan tüm URL sirayla actiktan sonra en son URL tekrar acar ve kapatir.

        // driver.quit(); --> quit acik olan tüm browser'lari kapatirken, close sadece 1 browser kapatir.
        driver.close();
}
    }

package Tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {

    // Amazon web sayfasine gidip JAVA icin arama yapin. Ve bulunan sonuc sayisini yazdirin.

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("JAVA" + Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(result.getText());

        // WebElement'ler obje oldugu icin direkt yazdirilamazlar. WebElement'in sahip oldugu yaziyi String olarak yazdirmak icin getText() method'u kullanilir.


    }
}

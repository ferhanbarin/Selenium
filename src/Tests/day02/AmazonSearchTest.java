package Tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {

/*
    1. Bir class olusturun. --> AmazonSearchTest
    2. Main method olusturun ve asagidaki görevi tamamlayin.
        a. Amazon web sayfasına gidin. --> https://www.amazon.com/
        b. Search(ara) “city bike”
        c. Amazon'da görüntülenen ilgili sonuclarin sayisini yazdirin.
        d. "Gift Cards" tiklayin.
        e. Sonra karsiniza cikan ilk sonucun resmine tiklayin.
 */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("city bike" + Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(result.getText());

        WebElement giftCards = driver.findElement(By.linkText("Gift Cards"));
        giftCards.click();

        WebElement eGift = driver.findElement(By.xpath("//*[@id=\"acs-product-block-0\"]/a/span/span[2]"));
        eGift.click();
    }
}

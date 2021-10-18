package Tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElement {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        // E-mail textbox'a Ferhan yazdiralim.
        WebElement mailTextBox = driver.findElement(By.id("email"));
        mailTextBox.sendKeys("ferhanselenium@gmail.com");

        Thread.sleep(2000);
        mailTextBox.clear();
        WebElement mailKutusuTagNameIle = driver.findElement(By.tagName("input"));
        // mailKutusuTagNameIle.sendKeys("ferhanbarin@gmail.com");
        // Input tagname ile 6 tane WebElement oldugundan hangisine yazacagina karar veremiyor. WebElement'i buldugu icin NoSuchElementException vermez.

        // WebElement yanlisElement = driver.findElement(By.id("emailyanlis"));
        // yanlisElement.sendKeys("Yanlis Eleman");


        // Giris Yap butonuna tiklayalim.
        WebElement girisButonu = driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
        girisButonu.click();

    }
}

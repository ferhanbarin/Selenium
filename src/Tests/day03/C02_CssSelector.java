package Tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CssSelector {

/*
    1. Bir class olusturun : Locators_css
    2. Main method olusturun ve asagidaki görevi tamamlayin.
        a. Verilen web sayfasina gidin. http://a.testaddressbook.com/sign_in
        b. Locate email textbox
        c. Locate password textbox ve
        d. Locate sign in button
        e. Asagidaki kullanici adini ve sifreyi girin ve sign in dügmesini tiklayin.
        i. Username : ferhanselenium@gmail.com
        ii. Password : Test1234!
 */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailTextBox = driver.findElement(By.cssSelector(".form-control"));
        emailTextBox.sendKeys("ferhanselenium@gmail.com");

        WebElement passwordTextBox1 = driver.findElement(By.cssSelector("input[id='session_password']"));
        // WebElement passwordTextBox1 = driver.findElement(By.cssSelector("#session_password")); --> CSS Selector ile kisa sekilde yazilis.
        // WebElement passwordTextBox = driver.findElement(By.xpath("(//input[@class='form-control'])[2]")); --> XPath ile yazilis.

        // passwordTextBox.sendKeys("Test1234!"); --> XPath ile deger yazdirma.
        passwordTextBox1.sendKeys("Test1234!");

        WebElement submitButonu = driver.findElement(By.cssSelector("input[type='submit']"));
        // WebElement submitButonu = driver.findElement(By.xpath("//input[@type='submit']")); --> XPath ile yazilis.
        submitButonu.click();

        driver.close();

    }
}

package Tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class C03_Locators {

/*
    1. Bir class oluşturun: C03_Locators
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in) buttonunu tıklayın:
    i. Username : ferhanselenium@gmail.com
    ii. Password : Test1234!
    e. Expected user id nin ferhanselenium@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini (displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
*/

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://a.testaddressbook.com");

        WebElement category = driver.findElement(By.xpath("/html/body/nav/button/span"));
        category.click();

        WebElement signInLink = driver.findElement(By.linkText("Sign in"));
        signInLink.click();

        Thread.sleep(3000);

        WebElement emailTextBox = driver.findElement(By.id("session_email"));
        WebElement passwordTextBox = driver.findElement(By.id("session_password"));
        WebElement signInButton = driver.findElement(By.name("commit"));

        emailTextBox.sendKeys("ferhanselenium@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButton.click();

        WebElement dogruKullanici = driver.findElement(By.className("navbar-text"));
        String username = "ferhanselenium@gmail.com";

        if (dogruKullanici.getText().equals(username)) {
            System.out.println("Dogru Kullanici Testi PASS.");
        } else {
            System.out.println("Dogru Kullanici Testi FAILED.");
        }

        WebElement adressesLink = driver.findElement(By.linkText("Adresses"));
        WebElement signOutLink = driver.findElement(By.linkText("Sign out"));

        if (adressesLink.isDisplayed()) {
            System.out.println("Adresses link görünüyor. TEST PASS.");
        } else {
            System.out.println("Adresses link görünmüyor. TEST FAILED.");
        }


        if (signOutLink.isDisplayed()) {
            System.out.println("Sign Out link görünüyor. TEST PASS.");
        } else {
            System.out.println("Sign Out link görünmüyor. TEST FAILED.");
        }

        List <WebElement> linkSayisi = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki Link Sayisi : " + linkSayisi.size());

        // Linklerin yazilarini yazdiralim.
        // Elimizdeki listedeki tüm WebElement'lerin yazilarini forLoop veya forEachLoop ile yazdirabiliriz.
        // Tüm elementler yazdirilacaksa bu durumda forEachLoop dah kullanisli olacaktir.

        for (WebElement each: linkSayisi) {
            System.out.println(each.getText());
        }

        linkSayisi.stream().forEach(t -> System.out.println(t.getText()));

        driver.close();

    }
}

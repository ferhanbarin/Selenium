package Tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {

/*
    1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin.
    2- Add Element butonuna basin.
    3- Delete butonu’nun gorunur oldugunu test edin.
    4- Delete tusuna basin.
    5- Delete butonunun gorunur olmadigini test edin.
 */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ferha/Documents/Selenium Dependencies/Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // WebElement addButonu = driver.findElement(By.tagName("button"));
        // WebElement addButonu = driver.findElement(By.xpath("//button"));
        // WebElement addButonu = driver.findElement(By.xpath("//button[text()='Add Element']"));
        // WebElement addButonu = driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addButonu.click();

        WebElement deleteButonu = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("Delete butonu testi PASS.");
        } else {
            System.out.println("Delete butonu testi FAILED.");
        }

        deleteButonu.click();

        // Eger butona bastigimizda HTML kodundaki satirda siliniyorsa driver'in o elemente ulasmasi mümkün olmayacagindan varligini yada yoklugunu test etmemiz mümkün olmaz.
        // Varolan bir element bu sekilde silindikten sonra locate etmeye calisirsak StaleElementReferenceException'i aliriz.

        driver.close();

    }

}

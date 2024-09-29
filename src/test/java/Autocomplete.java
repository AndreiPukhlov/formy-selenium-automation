import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");
        WebElement address = driver.findElement(By.id("autocomplete"));
        address.sendKeys("20800 Homestead Rd, Cupertino, CA");
        WebElement address_2 = driver.findElement(By.id("street_number"));

        Thread.sleep(5000);
        driver.quit();
    }
}

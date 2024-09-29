import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Andrei Pukhlov");
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.id("button"));
        button.click();
        Thread.sleep(3000);

        driver.quit();
    }
}

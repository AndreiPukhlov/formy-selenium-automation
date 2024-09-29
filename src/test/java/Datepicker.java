import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Datepicker {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement date_field = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datepicker")));
        date_field.sendKeys("09/20/2024");
        date_field.sendKeys(Keys.RETURN);
        driver.quit();
    }
}
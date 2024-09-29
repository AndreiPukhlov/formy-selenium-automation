import io.cucumber.java8.Th;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import static support.TestContext.getExecutor;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
        WebElement modal_button = driver.findElement(By.id("modal-button"));
        modal_button.click();
        WebElement close_button = driver.findElement(By.id("close-button"));
        close_button.click();

        getExecutor().executeScript("arguments[0].click();", close_button);
        Thread.sleep(5000);
        driver.quit();
    }
}

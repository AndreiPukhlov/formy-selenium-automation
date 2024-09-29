import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class DragAndDrop {
    public static void main(String[] args){


        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://formy-project.herokuapp.com/dragdrop");
        WebElement image = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("image")));
        WebElement box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("box")));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(image, box).build().perform();
        WebElement text = driver.findElement(By.xpath("//p[text()='Dropped!']"));

        Assert.assertEquals("Dropped!", text.getText());

        driver.quit();
    }
}


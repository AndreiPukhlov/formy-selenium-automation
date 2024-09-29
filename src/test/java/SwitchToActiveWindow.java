import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "/Users/meaghanlewis/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        WebElement new_tub_button = driver.findElement(By.id("new-tab-button"));
        new_tub_button.click();
        Thread.sleep(2000);
        String originalHandle = driver.getWindowHandle();
        for(String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }
        driver.switchTo().window(originalHandle);
        Thread.sleep(2000);
        driver.quit();
    }
}

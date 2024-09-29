import io.cucumber.java8.Tr;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");
        WebElement radio_button_1 = driver.findElement(By.id("radio-button-1"));
        radio_button_1.click();

        WebElement radio_button_2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radio_button_2.click();

        WebElement radio_button_3 = driver.findElement(By.xpath("//input[@value='option3']"));
        radio_button_3.click();

        Thread.sleep(3000);

        driver.quit();
    }
}

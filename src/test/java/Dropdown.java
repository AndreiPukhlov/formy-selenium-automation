import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.id("dropdownMenuButton"));
        dropDown.click();
        WebElement file_uploader = driver.findElement(By.xpath("(//div[@class='dropdown-menu show']/a)[8]"));
        file_uploader.click();
        Thread.sleep(1000);

        WebElement file_field = driver.findElement(By.id("file-upload-field"));
        file_field.sendKeys("downloads/file-to-upload.png");
        Thread.sleep(3000);
        driver.quit();
    }
}

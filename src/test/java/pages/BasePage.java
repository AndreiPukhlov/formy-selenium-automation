package pages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static support.TestContext.getDriver;
import static support.TestContext.getExecutor;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(getDriver(),this);
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void openPage(){
        getDriver().get(url);

    }

    public void waitForElementVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    public void clickWithJS(WebElement element){
        getExecutor().executeScript("argument[0].click();", element);
    }

    public void click(WebElement element){
        waitForElementVisible(element);
        try {
            element.click();
        } catch (WebDriverException e){
            clickWithJS(element);
        }
    }

    public void sendKeys(WebElement element, String text){
        waitForElementVisible(element);
        element.sendKeys(text);
    }


}

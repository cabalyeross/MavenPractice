import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationPage extends BasePage {
    protected WebDriver driver;

    public SynchronizationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(partialLinkText = "Synchronization")
    public WebElement clickSynchronization;

    public boolean synchroMethod() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        WebElement input = driver.findElement(By.xpath("//input[@id='input-text']"));
        input.sendKeys("Alisher");
        WebElement display = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        display.click();
        WebElement displayName = driver.findElement(By.xpath("//div[@id='text-display']"));
        wait.until(ExpectedConditions.textToBePresentInElement(displayName, "Alisher"));
        if (displayName.getText().equalsIgnoreCase("Alisher")) {
            return true;
        }
          return false;


    }
}


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage extends BasePage {
    protected WebDriver driver;

    public AlertPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(partialLinkText = "Alert")
    public WebElement clickAlert;

    public void alertButtons() {
        WebElement first = driver.findElement(By.xpath("//button[@class='btn btn-success m-2']"));
        first.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement second = driver.findElement(By.xpath("//button[@class='btn btn-outline-success']"));
        second.click();
        alert.sendKeys("Ali");
        alert.accept();



    }


}

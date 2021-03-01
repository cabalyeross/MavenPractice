import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {
    private AlertPage alertPage;



    @BeforeMethod
    public void set() {
        alertPage = new AlertPage(driver);
        alertPage.implicitWayt();
        alertPage.clickAlert.click();
    }

    @Test
    public void testAlert ()  {
        alertPage.alertButtons();


    }
}

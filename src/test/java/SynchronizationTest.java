import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SynchronizationTest extends BaseTest {
    private SynchronizationPage synchronizationPage;

    @BeforeMethod
    public void set() {
        synchronizationPage = new SynchronizationPage(driver);
        synchronizationPage.implicitWayt();
        synchronizationPage.clickSynchronization.click();
    }
    @Test
    public void test1() {
       Assert.assertTrue(synchronizationPage.synchroMethod());

    }
}

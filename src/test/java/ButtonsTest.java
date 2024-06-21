import com.demoqa.drivers.DriverManager;
import com.demoqa.pages.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest {

    @Test (description = "verify double click button  is working propertly")
    public void doubleClickTest () throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        webElementActions.doubleClick(demoQAPages.getButtonsPage().doubleClickBtn);
        Thread.sleep(3000);
        Assert.assertEquals(demoQAPages.getButtonsPage().doubleClickMessage.getText(), "You have done a double click");
    }

    @Test (description = "verify right click button  is working propertly")
    public void rightClickTest () throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        webElementActions.rightClick(demoQAPages.getButtonsPage().rightClickBtn);
        Thread.sleep(3000);
        Assert.assertEquals(demoQAPages.getButtonsPage().rightClickMessage.getText(), "You have done a right click");
    }


}

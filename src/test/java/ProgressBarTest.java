import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProgressBarTest extends BaseTest{

    @Test
    public void progressBarTest () throws InterruptedException {
        browserHelper.open("https://demoqa.com/progress-bar");
        webElementActions.click(demoQAPages.getProgressBarPage().startStopButton);
        Thread.sleep(2000);

        webElementActions.click(demoQAPages.getProgressBarPage().startStopButton);
        Thread.sleep(6000);

        System.out.println(demoQAPages.getProgressBarPage().ariaValueNow.getAttribute("aria-valuenow"));
        Assert.assertEquals(demoQAPages.getProgressBarPage().ariaValueNow.getAttribute("aria-valuenow"),52 );


    }
}

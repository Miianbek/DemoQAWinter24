import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BrowserHelperTest extends BaseTest {

    @Test
    void browserHelperTest () throws InterruptedException {
        browserHelper.open("https://demoqa.com/browser-windows");
        Thread.sleep(3000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchToWindows(0);
        Thread.sleep(3000);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchToWindows(0);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchToWindows(0);
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        browserHelper.switchToWindows(4);
        Thread.sleep(3000);
        browserHelper.switchToParentWithCloseChild();
        Thread.sleep(3000);




    }

}

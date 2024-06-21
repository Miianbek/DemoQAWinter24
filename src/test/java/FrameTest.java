import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{

    @Test (description = "Verify thaat driver can switch to another frame")
    public void toSwitchFrame () {
        browserHelper.open("https://demoqa.com/frames");
        iframeHelper.switchToFrame("frame1"); // Сначала должны переключится на нужный фрейм и после что-то делать и искать

        System.out.println(driver.findElement(By.id("sampleHeading")).getText());

        iframeHelper.switchToParentFrame();
        System.out.println(driver.findElement(By.tagName("h1")).getText());


    }
}

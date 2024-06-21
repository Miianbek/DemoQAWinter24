import com.demoqa.enums.Endpoints;
import com.demoqa.utils.ConfigReader;
import io.qameta.allure.*;
import io.qameta.allure.testng.Tag;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {

    @Test(groups = {"Smoke","UI","1721"},description = "Alert test")
    @Description("Verify that alert is present ")
    @Owner("Mika")
    @Tag("Smoke")
    @Severity(SeverityLevel.CRITICAL)
    @Story("GSPINT")
    @Epic("Registration")
    @Link("ww.google.com")

    void alertTest () throws InterruptedException {
        browserHelper.open(ConfigReader.getValue("baseURL")+ Endpoints.ALERT.getEndpoint());
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();
        webElementActions.pause(5);

    }

    @Test(groups = {"Regression","API","1722"},description = "Alert test1")

    void alertTest1 () throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();

    }

    @Test(groups = {"E2E","SQL","1721"},description = "Alert test2")

    void alertTest2 () throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        webElementActions.click(demoQAPages.getAlertPage().confirmAlertBtn);
        Thread.sleep(3000);
        alertHelper.acceptAlert();

    }

}

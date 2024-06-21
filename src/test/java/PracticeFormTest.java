import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest{
    @Test
    void test123 () throws InterruptedException {
        browserHelper.open("https://demoqa.com/automation-practice-form");
        demoQAPages.getPracticeFormPage().selectDateMonthYear("30 June 2020");
        Thread.sleep(3000);

    }
}

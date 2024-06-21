import com.demoqa.entities.Employee;
import com.demoqa.utils.RandomUtils;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest extends BaseTest{
    @Test(description = "Web table test")
    void test123() {
        driver.get("https://demoqa.com/webtables");
        demoQAPages.getWebTablePage().addNewEmployee(randomUtils.createMockEmployee());

        List<Employee> employees=demoQAPages.getWebTablePage().getEmployeesFromTable();

        for (Employee employee:employees) {
            System.out.println(employee);
        }

    }
}

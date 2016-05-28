package hibernateTests;

import main.java.pl.corpomanager.employeemanager.Employee;
import main.java.pl.corpomanager.employeemanager.Privilege;
import org.testng.annotations.Test;
import pl.corpomanager.databasehandler.SaverRemover;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stycz on 28.05.16.
 */
public class SaverRemoverTest {

    @Test
    public void testIfEmployeeCanBeSavedInDB(){
        SaverRemover saverRemover = new SaverRemover();
        Employee employee = new Employee();
        employee.setFirstName("Jan");
        employee.setSurname("TakiTam");
        employee.setPassword("ykmd6y2y");
        employee.setMailAddress("jam@chuj.pl");
        employee.setPost("KIERONIWK");
        employee.setPrivilage(Privilege.JUNIOR);
        employee.setPESEL("awsfdgh");
        employee.setTelNumber(734430073);
        employee.setBirthDate(new Date());

        assertThat(saverRemover.saveEmployeeinDatabase(employee)).isTrue();
    }

    @Test
    public void testIfEmployeeCanBeRemovedFromDB(){
        SaverRemover saverRemover = new SaverRemover();
        Employee employee = new Employee();
        employee.setFirstName("Jan");
        employee.setSurname("TakiTam");
        employee.setPassword("ykmd6y2y");
        employee.setMailAddress("jam@chuj.pl");
        employee.setPost("KIERONIWK");
        employee.setPrivilage(Privilege.JUNIOR);
        employee.setPESEL("awsfdgh");
        employee.setTelNumber(734430073);
        employee.setBirthDate(new Date());
        saverRemover.saveEmployeeinDatabase(employee);
        assertThat(saverRemover.deleteEmployeeFromDatabase(employee)).isTrue();

    }
}

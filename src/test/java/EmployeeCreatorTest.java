import main.java.pl.corpomanager.employeemanager.EmployeeCreator;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by stycz on 26.05.16.
 */
public class EmployeeCreatorTest {
    EmployeeCreator employeeHandler = new EmployeeCreator();


    @Test
    public void testIfUserCanBeCreated(){
        EmployeeCreator employeeCreator = new EmployeeCreator();
        String name = "Jan";
        InputStream in = new ByteArrayInputStream(name.getBytes());
        System.setIn(in);

        assertThat(name).isEqualTo(employeeCreator.insertName());
    }

}

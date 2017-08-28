package org.bluemoon.restapimedium.Service;

/**
 * Created by chand on 08/19/2017.
 */
import org.bluemoon.restapimedium.Model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee getEmployeeById(long id);
    List<Employee> getAllEmployees();
}

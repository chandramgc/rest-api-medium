package org.bluemoon.restapimedium.Implementation;

/**
 * Created by chand on 08/19/2017.
 */
import java.util.List;


import org.bluemoon.restapimedium.Data.EmployeeRepository;
import org.bluemoon.restapimedium.Model.Employee;
import org.bluemoon.restapimedium.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}

package org.bluemoon.restapimedium.Data;

/**
 * Created by chand on 08/19/2017.
 */

import org.bluemoon.restapimedium.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("employeeRepository")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

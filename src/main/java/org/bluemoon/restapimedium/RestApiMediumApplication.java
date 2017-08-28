package org.bluemoon.restapimedium;


import org.bluemoon.restapimedium.Data.EmployeeRepository;
import org.bluemoon.restapimedium.Model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ContextConfiguration(locations = { "file:./src/resources/application.properties" })
public class RestApiMediumApplication {

	private static final Logger logger = LoggerFactory.getLogger(RestApiMediumApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(RestApiMediumApplication.class, args);
	}
	@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(new Employee("Gustavo", "Ponce", true));
			employeeRepository.save(new Employee("John", "Smith", true));
			employeeRepository.save(new Employee("Jim ", "Morrison", false));
			employeeRepository.save(new Employee("David", "Gilmour", true));
			logger.info("The sample data has been generated");
		};
	}
}

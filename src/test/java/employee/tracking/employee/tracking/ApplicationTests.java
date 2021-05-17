package employee.tracking.employee.tracking;

import employee.tracking.employee.tracking.models.Employee;
import employee.tracking.employee.tracking.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createSingleEmployeeAndSave(){
		Employee employee = new Employee("Pete", 18, 666, "oneandonlypete@gmail.com");
		employeeRepository.save(employee);
	}

}

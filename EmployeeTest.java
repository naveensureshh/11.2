import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@AfterEach
    void afterEach() {
        System.out.println("After each test method of the Employee class");
    }
	@Test
	@DisplayName
	("Display  Employee Class Identity")
    void sampleTestForMethodA() {
        System.out.println("Display Employee salary, office, and dateHired");
    }
	

}



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StudentTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@AfterEach
    void afterEach() {
        System.out.println("After each test method of the person  class");
    }
	@Test
	@DisplayName
	("Display Student Class Identity")
    void sampleTestForMethodA() {
        System.out.println("Display Student identity, as Freshman, Sophomore, Junior, Senior");
    }
	

}



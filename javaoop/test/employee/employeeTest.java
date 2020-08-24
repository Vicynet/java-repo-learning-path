package employee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class employeeTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void compensationEarningTest() {
//		CompensationModel comm = new CommissionCompensationModel(250000, 0.1);
//		CompensationModel baseComm = new BsaePlusCommissionCompensationModel(500000, 0.1, 10000);
		CompensationModel commi = new CommissionCompensationModel(0,1);
		
		Employee victor = new Employee("victor", "David", "Tolu", commi);
		assertEquals(victor.earning(), 4.0);
		

	}

}

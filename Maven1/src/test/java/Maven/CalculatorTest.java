package Maven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import MockitoTest.Calculator;
import MockitoTest.CalculatorService;

public class CalculatorTest {

	Calculator c =null;
	@Mock
	CalculatorService service;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new Calculator(service);
	}
	
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPerform() {
		
		
		 c.add(2,3); 
		// when(service.add(2,3)).thenReturn(10);
		 assertEquals(10,c.add(2,3));
		// verify(Service).add(2,3);
		 
		 
		
	}
	
	/*public void test() {
		//fail("Not yet implemented");
	}*/
}

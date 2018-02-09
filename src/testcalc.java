import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.*;

class testcalc {

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
	void test() {
	//fail("Not yet implemented");
	
	 double result = new Model().operations(5, 8, "+");
   // assertThat(result);
	 assertEquals(result,13.0);
	 
	
	 
	}

	@Test
	void test1() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(5, 8, "-");
   // assertThat(result);
	 assertEquals(result11,-3.0);

	}
	
	@Test
	void test2() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(5, 0, "*");
   // assertThat(result);
	 assertEquals(result11,0);

	}
	@Test
	void test3() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(25,5, "/");
   // assertThat(result);
	 assertEquals(result11,5);

	}
	
	@Test
	void test4() {
	//fail("Not yet implemented");
	
	 double result11 = new Model().operations(26, 5, "%");
   // assertThat(result);
	 assertEquals(result11,1);

	}
	
	void test5() {
		//fail("Not yet implemented");
		
		 double result11 = new Model().operations(9, 0,"squt root");
	  
		 assertEquals(result11,90);

		}
}

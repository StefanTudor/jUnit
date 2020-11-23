package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testBoundarySetPunctajMaxim {
	
	TestGrila test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String denumire = "Anonim";
		int punctajMaxim = 80;
		int dificultate = 1;
		test = new TestGrila(denumire, punctajMaxim, dificultate);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBoundaryMaxLimitSetPunctajMaxim() {
		
		test.setPunctajMaxim(90);
		assertEquals(90, test.getPunctajMaxim());
	}

}

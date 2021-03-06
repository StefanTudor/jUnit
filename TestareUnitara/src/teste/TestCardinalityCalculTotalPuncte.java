package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCardinalityCalculTotalPuncte {
	
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
	
	@Category(TesteSpeciale.class)
	@Test
	public void testBoundaryCalculTotal2Puncte() {
		
		ArrayList<Integer> puncte = new ArrayList<>(Arrays.asList(5,6));
		test.setPunctajeIntrebari(puncte);
		
		assertEquals(11,test.calculTotalPuncte());
		
	}
		

}

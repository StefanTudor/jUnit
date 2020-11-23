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

public class TestExistenceCalculTotalPuncte {
	
	TestGrila test;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testExistenceCalculTotalPuncteListNull() {
		
		ArrayList<Integer> puncte = null;
		test.setPunctajeIntrebari(puncte);
		
	}
	
	@Category(TesteSpeciale.class)
	@Test(expected=NullPointerException.class)
	public void testExistenceCalculTotalPuncteListEmpty() {
		
		ArrayList<Integer> puncte = new ArrayList<>();
		test.setPunctajeIntrebari(puncte);
		
		test.calculTotalPuncte();
		
	}
	
	public void testExistenceCalculTotalPuncteWrongDif() {
		
		String denumire = "Anonim";
		int punctajMaxim = 80;
		int dificultate = 2;
		test = new TestGrila(denumire, punctajMaxim, dificultate);
		
		ArrayList<Integer> puncte = new ArrayList<>(Arrays.asList(4,5,6));
		test.setPunctajeIntrebari(puncte);
		
		assertEquals(30, test.calculTotalPuncte(), 0.05);
		
	}
		

}

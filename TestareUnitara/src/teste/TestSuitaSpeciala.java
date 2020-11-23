package teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@SuiteClasses({TestCardinalityCalculTotalPuncte.class, TestErrorConditionSetPunctajMaxim.class, 
	TestExistenceCalculTotalPuncte.class})
@IncludeCategory(TesteSpeciale.class)
public class TestSuitaSpeciala {

}

package testsSuite;

import dubluri.TestePromovabilitateGrupaCuDubluri;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.GrupaTest;
import tests.TestGetPromovabilitateGrupa;
import tests.TestPromovabilitateGrupaWithFixture;
import testsSuite.categorii.TestePromovabilitateCategory;
import testsSuite.categorii.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class, TestePromovabilitateGrupaCuDubluri.class, TestGetPromovabilitateGrupa.class, TestPromovabilitateGrupaWithFixture.class})
//@Categories.IncludeCategory(TestePromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}

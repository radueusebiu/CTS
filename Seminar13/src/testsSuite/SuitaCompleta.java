package testsSuite;

import dubluri.TestePromovabilitateGrupaCuDubluri;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.GrupaTest;
import tests.TestGetPromovabilitateGrupa;
import tests.TestPromovabilitateGrupaWithFixture;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, TestGetPromovabilitateGrupa.class, TestePromovabilitateGrupaCuDubluri.class, TestPromovabilitateGrupaWithFixture.class})
public class SuitaCompleta {

}

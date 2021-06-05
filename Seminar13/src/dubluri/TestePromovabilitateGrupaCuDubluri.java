package dubluri;

import clase.Grupa;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import testsSuite.categorii.TestePromovabilitateCategory;
import testsSuite.categorii.TesteUrgente;

import static org.junit.Assert.*;

public class TestePromovabilitateGrupaCuDubluri {
    @Test
    public void testReference(){
        Grupa grupa = new Grupa(1070);
        grupa.adaugaStudent(new StudentDummy());
        grupa.adaugaStudent(new StudentDummy());

        assertEquals(2,grupa.getStudenti().size());
    }

    @Test
    @Category(TestePromovabilitateCategory.class)
    public void testReferenceCuStub(){
        Grupa grupa = new Grupa(1070);
        grupa.adaugaStudent(new StudentiStub());
        grupa.adaugaStudent(new StudentiStub());
        assertEquals(1,grupa.getPromovabilitate(),0.01);
    }

    @Test
    @Category({TestePromovabilitateCategory.class, TesteUrgente.class})
    public void testReferenceCuFake(){
        Grupa grupa = new Grupa(1063);
        for(int i=0;i<7;i++){
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestanta(false);
            grupa.adaugaStudent(studentFake);
        }
        for(int i=0;i<3;i++){
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareAreRestanta(true);
            grupa.adaugaStudent(studentFake);
        }
        assertEquals(0.7,grupa.getPromovabilitate(),0.01);
    }
}
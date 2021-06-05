package tests;

import clase.Grupa;
import clase.Student;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestPromovabilitateGrupaWithFixture {
    private Grupa grupa;

    @Before
    public void setUp(){
        grupa = new Grupa(1070);
        for(int i=0;i<35;i++) {
            Student student = new Student("Gigel");
            student.adaugaNota(7);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    public void testPerformancePentruTimp(){
        grupa.getPromovabilitate();
    }
}
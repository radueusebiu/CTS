package tests;

import clase.Grupa;
import clase.Student;
import dubluri.StudentDummy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestGetPromovabilitateGrupa {

    @Test
    public void testRight(){
        Grupa grupa = new Grupa(1085);
        for(int i = 0; i<3;i++){
            Student student = new Student("Gigel");
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
        for(int i = 0; i<7;i++){
            Student student = new Student("Gigel");
            student.adaugaNota(9);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.7,grupa.getPromovabilitate(),0.01);
    }
    @Test
    public void testGetPromovabilitateLowerBound() {
        Grupa grupa = new Grupa(1085);
        for(int i=0;i<6;i++) {
            Student student = new Student("Rares");
            student.adaugaNota(3);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    public void testGetPromovabilitateUpperBound() {
        Grupa grupa = new Grupa(1085);
        for(int i=0;i<6;i++) {
            Student student = new Student("Rares");
            student.adaugaNota(7);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testError(){
        Grupa grupa = new Grupa(1011);
        grupa.getPromovabilitate();
    }

    @Test
    public void testReference(){
        Grupa grupa = new Grupa(1070);
        grupa.adaugaStudent(new StudentDummy());
        grupa.adaugaStudent(new StudentDummy());

        assertEquals(2,grupa.getStudenti().size());
    }

}
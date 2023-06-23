package org.longcg;

import static org.junit.Assert.*;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.longcg.entities.Gender;
import org.longcg.entities.Student;
import org.longcg.entities.Address;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-with-hibernate");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        /*
        Student student = new Student();
        student.setId(1L);
        entityManager.persist(student);

        entityManager.getTransaction().commit();
        entityManager.clear();

        //Student foundStudent = entityManager.find(Student.class, 1L);

        //assertThat(foundStudent).isEqualTo(student);

        //System.out.println(foundStudent.getId() + " - " + student.getId());

        //assertEquals(foundStudent.getId(), student.getId());

        //assertEquals(foundStudent, student);

        Student foundStudent = entityManager.find(Student.class, 2L);

        //assertThat(foundStudent.getId()).isEqualTo(2L);
        //assertThat(foundStudent.getFirstName()).isEqualTo("Doe");
        //assertThat(foundStudent.getLastName()).isEqualTo("John");


        assertEquals("John", foundStudent.getFirstName());
        assertEquals("Doe", foundStudent.getLastName());




         */

        Student foundStudent = entityManager.find(Student.class, 2L);


        // assertThat(foundStudent.getId()).isEqualTo(2L);

        // assertThat(foundStudent.getLastName()).isEqualTo("Doe");

        // assertThat(foundStudent.getFirstName()).isEqualTo("John");
        // assertThat(foundStudent.getBirthDateByDate()).isEqualTo(DateUtils.parse("2000-02-18"));
        // assertThat(foundStudent.getBirthDateByLocalDate()).isEqualTo(LocalDate.parse("2000-02-18"));
        // assertThat(foundStudent.getGender()).isEqualTo(Gender.MALE);
        // assertThat(foundStudent.getWantsNewLetter()).isTrue();

        assertEquals(foundStudent.getId(), Long.getLong("2L"));
        assertEquals(foundStudent.getFirstName(), "John");
        assertEquals(foundStudent.getLastName(), "Doe");
        assertEquals(foundStudent.getGender(), Gender.MALE);
        assertEquals(foundStudent.getWantsNewLetter(), Boolean.TRUE);


        Address address = new Address("Baker Street", "221B", "London");
        // assertThat(foundStudent.getAddress()).isEqualTo(address);
        assertEquals(foundStudent.getAddress().getCity(), address.getCity());


        entityManager.close();
    }
}

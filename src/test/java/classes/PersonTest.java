package classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {


    Person person;

    @BeforeEach
            public void init() {
        person  = new Person("Jaume", "Sánchez", 33);

    }

    @AfterEach
    public void tearDown() {
        person = null;
    }




    @Test
    public void showInfo_deletesCorrectlySpaces() {

        person.setName("Jaume     ");
        assertEquals("Jaume Sánchez is 33 old", person.showInfo() );

    }


    @Test
    public void setAge_ageIsCorrect_resultCorrect() {

        person.setAge(33);
        assertEquals(33, person.getAge());

    }

    @Test
    public void setAge_ageIsHigherThan100_ageIs0() {

        person.setAge(140);
        assertEquals(0, person.getAge());
    }

    @Test
    public void setAge_ageIsLowerThan0_ageIs0() {
        person.setAge(-10);
        assertEquals(0, person.getAge());
    }
}

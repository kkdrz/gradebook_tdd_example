package pl.edu.pwr.zwo.gradebook;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class SubjectTest {

    @Test
    public void shouldInstantiateSubject() {
        Subject subject = new Subject("matematyka");

        assertNotNull(subject);
    }

}
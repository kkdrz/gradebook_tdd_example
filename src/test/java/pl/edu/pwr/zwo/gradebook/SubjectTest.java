package pl.edu.pwr.zwo.gradebook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SubjectTest {

    private static final String SUBJECT_NAME = "matematyka";
    private Subject subject;

    @Before
    public void setUp() {
        subject = new Subject(SUBJECT_NAME);
    }

    @Test
    public void shouldInstantiateSubject() {
        assertNotNull(subject);
    }

    @Test
    public void shouldBeAbleToComputeAverageNote() {
        subject.addNote(4);
        subject.addNote(5);

        assertEquals(4.5, subject.getAverage(), 0.001);
    }
}
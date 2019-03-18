package pl.edu.pwr.zwo.gradebook;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GradeBookTest {

    @Test
    public void shouldCreateGradeBook() {
        GradeBook gradeBook = new GradeBook();
        assertNotNull(gradeBook);
    }
}
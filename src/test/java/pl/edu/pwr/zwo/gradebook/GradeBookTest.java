package pl.edu.pwr.zwo.gradebook;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GradeBookTest {

    @Test
    public void shouldCreateGradeBook() {
        GradeBook gradeBook = new GradeBook();

        assertNotNull(gradeBook);
    }

    @Test
    public void shouldAddNewSubject() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addSubject(new Subject("matematyka"));
    }
}
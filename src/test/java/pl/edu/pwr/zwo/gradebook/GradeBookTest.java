package pl.edu.pwr.zwo.gradebook;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GradeBookTest {

    @Test
    public void shouldCreateGradeBook() {
        GradeBook gradeBook = new GradeBook();

        assertNotNull(gradeBook);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenAddingSubjectThatAlreadyExists() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addSubject("matematyka");
        gradeBook.addSubject("matematyka");
    }
}
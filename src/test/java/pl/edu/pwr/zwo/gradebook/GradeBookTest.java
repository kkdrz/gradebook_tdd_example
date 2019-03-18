package pl.edu.pwr.zwo.gradebook;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GradeBookTest {

    private static final String SUBJECT = "matematyka";

    @Test
    public void shouldCreateGradeBook() {
        GradeBook gradeBook = new GradeBook();

        assertNotNull(gradeBook);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenAddingSubjectThatAlreadyExists() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addSubject(SUBJECT);
        gradeBook.addSubject(SUBJECT);
    }

    @Test
    public void shouldGetSubjectFromGradeBook() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addSubject(SUBJECT);

        assertNotNull(gradeBook.getSubject(SUBJECT));
    }

}
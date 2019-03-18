package pl.edu.pwr.zwo.gradebook;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGettingNonExistingSubject() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.getSubject(SUBJECT);
    }

    @Test
    public void shouldGetValidSubjectFromGradeBook() {
        GradeBook gradeBook = new GradeBook();
        gradeBook.addSubject(SUBJECT);

        Subject subject = gradeBook.getSubject(SUBJECT);

        assertEquals(SUBJECT, subject.getName());
    }

    @Test
    public void shouldAddNoteToSubject() {
        GradeBook gradeBook = new GradeBook();
        gradeBook.addSubject(SUBJECT);

        gradeBook.addNote(SUBJECT, 4.5);
    }

}
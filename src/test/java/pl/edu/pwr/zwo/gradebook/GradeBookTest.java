package pl.edu.pwr.zwo.gradebook;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GradeBookTest {

    private static final String SUBJECT = "matematyka";

    private GradeBook gradeBookWithSubject;

    @Before
    public void setUp() {
        gradeBookWithSubject = new GradeBook();
        gradeBookWithSubject.addSubject(SUBJECT);
    }

    @Test
    public void shouldCreateGradeBook() {
        GradeBook gradeBook = new GradeBook();

        assertNotNull(gradeBook);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldThrowExceptionWhenAddingSubjectThatAlreadyExists() {
        gradeBookWithSubject.addSubject(SUBJECT);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGettingNonExistingSubject() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.getSubject(SUBJECT);
    }

    @Test
    public void shouldGetValidSubjectFromGradeBook() {
        Subject subject = gradeBookWithSubject.getSubject(SUBJECT);

        assertEquals(SUBJECT, subject.getName());
    }

    @Test
    public void shouldAddNoteToSubject() {
        gradeBookWithSubject.addNote(SUBJECT, 4.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenAddingNoteToNonExistingSubject() {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addNote(SUBJECT, 4.5);
    }

    @Test
    public void shouldComputeGlobalAverageNote()  {
        gradeBookWithSubject.addNote(SUBJECT, 3);
        gradeBookWithSubject.addNote(SUBJECT, 5);

        gradeBookWithSubject.addSubject("fizyka");
        gradeBookWithSubject.addNote("fizyka", 2);
        gradeBookWithSubject.addNote("fizyka", 4);

        assertEquals(3.5, gradeBookWithSubject.getAverageNote(), 0.001);
    }

}
package pl.edu.pwr.zwo.gradebook;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    private Map<String, Subject> subjects = new HashMap<>();

    public void addSubject(String subject) {
        if (subjects.containsKey(subject)) {
            throw new IllegalStateException(String.format("Subject %s already exists.", subject));
        }

        subjects.put(subject, new Subject(subject));
    }

    public Subject getSubject(String subject) {
        if (subjects.containsKey(subject)) {
            return subjects.get(subject);
        }

        throw new IllegalArgumentException(String.format("Subject %s doesn't exist.", subject));
    }

    public void addNote(String subjectName, double note) {
        Subject subject = getSubject(subjectName);
        subject.addNote(note);
    }

    public double getAverageNote() {
        return subjects.values()
                .stream()
                .mapToDouble(Subject::getAverage)
                .average()
                .orElse(0.0);

    }

}

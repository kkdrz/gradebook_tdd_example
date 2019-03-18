package pl.edu.pwr.zwo.gradebook;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    private Map<String, Subject> subjects = new HashMap<>();

    public void addSubject(String subject) {
        subjects.put(subject, new Subject(subject));
    }
}

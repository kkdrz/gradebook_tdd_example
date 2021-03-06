package pl.edu.pwr.zwo.gradebook;

import java.util.LinkedList;
import java.util.List;

public class Subject {

    private final String name;
    private List<Double> notes = new LinkedList<>();

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNote(double note) {
        notes.add(note);
    }

    public double getAverage() {
        return notes.stream()
                .mapToDouble(val -> val)
                .average()
                .orElse(0.0);
    }

}

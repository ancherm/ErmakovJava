package Part1;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name, List<Integer> marks) {
        this.name = name;
        addMark(marks);
    }

    public Student(String name, Integer... marks) {
        this(name, List.of(marks));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return new ArrayList<>(marks);
    }

    private boolean isCheckingMarks(List<Integer> marks) {
        for (int mark : marks) {
            if (mark < 2 || mark > 5) {
                throw new IllegalArgumentException("Это не оценка " + this.name + " " + mark);
            }
        }
        return true;
    }

    public void addMark(List<Integer> marks) {
        if (isCheckingMarks(marks)) this.marks.addAll(marks);
    }

    public void changeMark(int index, Integer mark) {
        if (isCheckingMarks(List.of(mark)))  this.marks.set(index, mark);
    }

    @Override
    public String toString() {
        if (marks == null) return name + ": []";
        return name + ": " + marks;
    }
}

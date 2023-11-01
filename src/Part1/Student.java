package Part1;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private List<Integer> marks = new ArrayList<>();

    public Student(String name) {
        this(name, null);
    }

    public Student(String name, List<Integer> marks) {
        this.name = name;
        addMark(marks);
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
        if (isCheckingMarks(List.of(mark))) this.marks.set(index, mark);
    }


    public double averageMarks() {
        double sumOfMarks = 0;
        for (Integer mark : marks) {
            sumOfMarks += mark;
        }
        return marks.size() > 0 ? sumOfMarks / marks.size() : 0;
    }

    public boolean isExcellentStudent() {
        if (marks.size() > 0) {
            for (Integer mark : marks) {
                if (mark != 5) return false;
            }
        } else return false;

        return true;
    }

    @Override
    public String toString() {
        if (marks == null) return name + ": []";
        return name + ": " + marks;
    }
}

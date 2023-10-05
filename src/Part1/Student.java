package Part1;

import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer> marks;

    public Student(String name, ArrayList<Integer> marks){
        this.name = name;
        this.marks = marks;
    }

    public void setMarks(ArrayList<Integer> marks) {
        this.marks.addAll(marks);
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    public void changeMark(int index, int mark) {
        marks.set(index, mark);
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

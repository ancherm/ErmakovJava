package Part1;

import java.util.ArrayList;


public class Student {
    String name;
    ArrayList<Integer> marks;

    public Student(String name, ArrayList<Integer> marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + ": " + marks + "";
    }



}

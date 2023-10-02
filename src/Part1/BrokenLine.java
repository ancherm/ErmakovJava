package Part1;

import java.util.ArrayList;

public class BrokenLine {
    ArrayList<Point> pointArrayList;

    public BrokenLine(ArrayList<Point> pointArrayList){
        this.pointArrayList = pointArrayList;
    }

    @Override
    public String toString() {
        return "Ломаная " + pointArrayList;
    }
}

package Part1;

import java.util.ArrayList;

public class BrokenLine {
//    Point[] pointArrayList;
    ArrayList<Point> pointArrayList;

    public BrokenLine(){}
    public BrokenLine(ArrayList<Point> pointArrayList) {
        this.pointArrayList = pointArrayList;
    }
//    public BrokenLine(Point...pointArrayList){
//        this.pointArrayList = pointArrayList;
//    }

    @Override
    public String toString() {
        return "Ломаная " + pointArrayList;
    }
}

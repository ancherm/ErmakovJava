package Part1;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Path> paths = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addPath(City city, int cost){
        paths.add(new Path(city, cost));
    }


    public String toString(){
        String s = name + ": ";
        for (Path path : paths){
            s += path + "  ";
        }
        return s;
    }
}

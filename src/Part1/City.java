package Part1;

import java.util.ArrayList;

public class City {
    private final String name;
    private ArrayList<Path> paths = new ArrayList<>();
    City city;
    int cost;

    public City(String name) {
        this.name = name;
    }

//    public City(String name, ArrayList<Path> paths) {
//        this.name = name;
//        this.paths.addAll(paths);
//    }

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
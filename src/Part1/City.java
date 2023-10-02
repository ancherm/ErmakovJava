package Part1;

import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Path> paths;

    public City(String name) {
        this.name = name;
        this.paths = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPath(City city, int cost){
        paths.add(new Path(city, cost));
    }


    public String toString(){
        String s = name + ": ";
        for (int i = 0; i < paths.size(); i++){
            s = s + paths.get(i) + "  ";
        }
        return s;
    }
}

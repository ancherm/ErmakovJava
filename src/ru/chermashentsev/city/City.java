package ru.chermashentsev.city;

import java.util.ArrayList;
import java.util.List;

public class City {
    private final String name;
    private List<Path> paths = new ArrayList<>();

    public City(String name) {
        this(name, null);
    }

    public City(String name, List<Path> paths) {
        this.name = name;
        if (paths != null){
            this.paths = paths;
            //TODO
            // одинаковые названия городов
        }
    }

    public String getName() {
        return name;
    }

    public List<Path> getPaths() {
        return paths;
    }

    protected boolean isStraightPath(City city) {
        for (Path path : paths) {
            if (path.getCity().equals(city)) return true;
        }
        return false;
    }

    public void addPath(City...city) {
        for (City c : city) {
            addPath(c, 0);
        }
    }
    public void addPath(City city, int cost){
        if (!isStraightPath(city)) {
            paths.add(new Path(city, cost));
        }
    }
    public void deletePath(City city) {
        Path pathForDelete = null;
        for (Path path : paths) {
            if (path.getCity().equals(city)) {
                pathForDelete = path;
                break;
            }
        }

        if (pathForDelete == null) {
            throw new IllegalArgumentException("Вы пытаетесь удалить путь, которого нет");
        }
        paths.remove(pathForDelete);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        City city = (City) obj;
        boolean fl;

        if (city.paths.size() != this.paths.size()) return false;

        for (int index = 0; index < paths.size(); index++) {
            outer:
            for (int j = 0; j < paths.size(); j++) {
                if (this.paths.get(index).equals(city.paths.get(j))) {
//                    fl = true;
//                    break;
                    break outer;
                }
                return false;
            }
//            if (!fl)   return false;


        }

        return true;
    }

    @Override
    public String toString(){
        String resultString = "Город " + name + ": ";
        for (Path path : paths){
            resultString += path + "  ";
        }
        return resultString;
    }
}

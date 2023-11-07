package part1;

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

    public String toString(){
        String resultString = "Город " + name + ": ";
        for (Path path : paths){
            resultString += path + "  ";
        }
        return resultString;
    }
}

package part1.city;

import java.util.List;

public class CityWithTwoPaths extends City {
    public CityWithTwoPaths(String name) {
        super(name);
    }
    public CityWithTwoPaths(String name, List<Path> paths) {
        super(name, paths);
    }

    @Override
    public void addPath(City city, int cost) {
        super.addPath(city, cost);
        if (!city.isStraightPath(this)) {
            city.addPath(this, cost);
        }
    }
    public void addPath(City...city) {
        for (City c : city) {
            addPath(c, 0);
        }
    }
}

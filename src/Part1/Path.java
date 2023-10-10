package Part1;

public class Path {
    private final City city;
    private final int cost;

    public Path(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return city.getName() + "{ " + cost + " }";
    }
}

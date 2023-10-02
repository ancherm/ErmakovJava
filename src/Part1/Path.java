package Part1;

public class Path {
    private City city;
    private int cost;

    public Path(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return city.getName() + "{ " + cost + " }";
    }
}

package ru.chermashentsev.city;

import java.util.Objects;

public class Path {
    private final City city;
    private final int cost;

    public Path(City city, int cost) {
        this.city = city;
        this.cost = cost;
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Path path = (Path) o;
        return cost == path.cost && city == path.city;
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, cost);
    }

    @Override
    public String toString() {
        return city.getName() + "{ " + cost + " }";
    }
}

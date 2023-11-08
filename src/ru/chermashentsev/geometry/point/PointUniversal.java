package ru.chermashentsev.geometry.point;

import java.util.ArrayList;
import java.util.List;

public class PointUniversal {
    List<Characteristic> characteristics;

    public PointUniversal(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public List<Characteristic> getCharacteristics() {
        return new ArrayList<>(characteristics);
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    @Override
    public String toString() {
        return characteristics + "";
    }
}

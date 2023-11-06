package Part1.Point;

public class Characteristic {
    private String title;
    private Object value;

    public Characteristic(String title, Object value) {
        this.title = title;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

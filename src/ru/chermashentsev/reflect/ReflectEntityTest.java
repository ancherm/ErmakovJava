package ru.chermashentsev.reflect;

import ru.chermashentsev.geometry.point.Point2D;
import ru.chermashentsev.person.Name;
import ru.chermashentsev.reflect.annotation.ToString;

@ToString(ToStringType.NO)
public class ReflectEntityTest extends Entity {
    @ToString
    public String title;
    protected int count;
    Point2D point;
    private Name name;
}

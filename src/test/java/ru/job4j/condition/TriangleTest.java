package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;

public class TriangleTest {
    @Test
    public void area1() {
        Point d1 = new Point(1, 1);
        Point d2 = new Point(1, 6);
        Point d3 = new Point(6, 1);
        Triangle tr = new Triangle(d1, d2, d3);
        assertEquals(tr.area(), 12.5, 0.01);
    }

    @Test
    public void area2() {
        Point d1 = new Point(2, 7);
        Point d2 = new Point(7, 4);
        Point d3 = new Point(5, 1);
        Triangle tr = new Triangle(d1, d2, d3);
        assertEquals(tr.area(), 10.5, 0.01);
    }
}

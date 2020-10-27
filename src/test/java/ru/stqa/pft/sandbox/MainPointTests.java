package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPointTests {

    @Test
    public void testMainPointOne() {
        Point p1 = new Point(30,15);
        Point p2 = new Point(10,55);
        Assert.assertEquals(p1.distance(p2), 44.721359549995796);
    }

    @Test
    public void testMainPointTwo() {
        Point p1 = new Point(30,15);
        Point p2 = new Point(10,55);
        Assert.assertEquals(p2.distance(p1), 44.721359549995796);
    }

    @Test
    public void testMainPointTree() {
        Point p1 = new Point(0,0);
        Point p2 = new Point(0, 0);
        Assert.assertEquals(p1.distance(p2), 0);
    }

}

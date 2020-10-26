package ru.stqa.pft.sandbox;

public class MainPoint {

    public static void main(String[] args) {
        Point p1 = new Point(30,15);
        Point p2 = new Point(10,55);
        System.out.println(p1.distance(p2));
    }
}

class Point{
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point a) {
        return Math.sqrt((a.x - this.x) * (a.x - this.x) + (a.y - this.y) * (a.y - this.y));
    }
}

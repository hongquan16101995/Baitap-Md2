package baitapjames.bai5;

public class MyCircle {
    private double radius = 1.0;
    private String color = "red";

    public MyCircle() {
    }

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}

package baitapjames.bai6;

public class MyCircle {
    public double radius;
    public String color;

    public MyCircle() {
    }

    public MyCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}

package baitapjames.bai7;

public class MyCircle implements Resizeable {
    private double radius;

    public MyCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + (this.radius *= percent);
    }
}

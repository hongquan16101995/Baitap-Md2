package baitapjames.bai7;

public class MyRectangle implements Resizeable{
    private double width;
    private double height;

    public MyRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + (this.width *=percent);
        this.height = this.height + (this.height *=percent);
    }
}

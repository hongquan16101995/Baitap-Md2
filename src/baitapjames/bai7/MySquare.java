package baitapjames.bai7;

public class MySquare implements Resizeable, Colorable {
    private double a;

    public MySquare(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "MySquare{" +
                "a=" + a +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.a = this.a + (this.a *= percent);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}

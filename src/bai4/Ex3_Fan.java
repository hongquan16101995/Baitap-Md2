package bai4;

public class Ex3_Fan {
    //hằng số ở dạng static để gọi sang Ex3 qua tên lớp; k cần phương thức
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    //setup giá trị mặc định cho các thuộc tính
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    //theo yêu cầu bài không cần constructor

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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


    //setup phương thức toString theo yêu cầu
    @Override
    public String toString() {
        String nameFan = "Ex3_Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'';

        if (on) {
            nameFan += ", fan is on}";
        } else {
            nameFan += ", fan is off}";
        }
        return nameFan;
    }
}

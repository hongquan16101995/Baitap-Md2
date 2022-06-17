package baitapjames.bai6;

public class MainTest {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(10, "red");

        MyCylinder myCylinder = new MyCylinder(20,"blue", 10);
        MyCircle myCircle1 = new MyCylinder(15,"black", 8);

        System.out.println(myCircle);
        System.out.println(myCylinder);
        System.out.println(myCircle1);
        System.out.println(myCircle.getArea());
        System.out.println(myCylinder.getArea());
        System.out.println(myCylinder.getVolume());
        System.out.println(((MyCylinder)myCircle1).getVolume());
    }
}

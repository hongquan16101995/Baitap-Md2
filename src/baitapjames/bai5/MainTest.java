package baitapjames.bai5;

public class MainTest {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle();
        System.out.println(myCircle.getRadius());
        System.out.println(myCircle.getArea());

        Student student = new Student();
        System.out.println(student.getName());
        System.out.println(student.getClasses());
        System.out.println(student.setName("Quân"));
        System.out.println(student.setClasses("C04"));
    }
}

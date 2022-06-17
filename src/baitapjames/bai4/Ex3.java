package baitapjames.bai4;

public class Ex3 {
    public static void main(String[] args) {
        Ex3_Fan fan1 = new Ex3_Fan();
        Ex3_Fan fan2 = new Ex3_Fan();

        //cài đặt cho fan 1
        fan1.setSpeed(Ex3_Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        //cài đặt cho fan 2
        //không cần cài đặt các cái khác vì đã theo mặc định
        fan2.setSpeed(Ex3_Fan.MEDIUM);

        //hiển thị đối tượng Quạt
        System.out.println(fan1);
        System.out.println(fan2);
    }
}

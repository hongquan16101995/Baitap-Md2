package baitapjames.bai7;

public class MainTest {
    public static void main(String[] args) {
        MyCircle myCircle = new MyCircle(10);
        MySquare mySquare = new MySquare(10);
        MyRectangle myRectangle = new MyRectangle(20, 10);

        System.out.println(myCircle);
//        myCircle.resize(0.5);
        myCircle.resize(- 0.5);
        System.out.println(myCircle);

        System.out.println(myRectangle);
        myRectangle.resize(0.5);
        System.out.println(myRectangle);

        mySquare.howToColor();
        Colorable colorable = (Colorable) mySquare;
//        Colorable colorable1 = (Colorable) myCircle;
    }
}

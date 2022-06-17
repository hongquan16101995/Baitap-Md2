package baitapjames.bai4;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số thứ 1: ");
        int heSoA = scanner.nextInt();
        System.out.println("Nhập vào hệ số thứ 2: ");
        int heSoB = scanner.nextInt();
        System.out.println("Nhập vào hệ số thứ 3: ");
        int heSoC = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(heSoA, heSoB, heSoC);

        if (quadraticEquation.getDiscriminant() < 0.0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation.getDiscriminant() == 0.0) {
            System.out.println("Pt có nghiệm kép: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Pt có 1 nghiệm là: "
                    + quadraticEquation.getRoot1() + " và "
                    + quadraticEquation.getRoot2());
        }
    }
}

class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}

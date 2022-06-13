package bai1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tiGia = 23000;
        System.out.println("Nhập vào số tiền USD:");
        double money = scanner.nextDouble();
//        double moneyVND = money * tiGia;
        System.out.println("Số tiền VND nhận được là: " + (money * tiGia));
    }
}

package bai2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Rectangle");
            System.out.println("2. TriangleBottom");
            System.out.println("3. TriangleTop");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    rectangle(scanner);
                    break;
                case 2:
                    triangleBottom(scanner);
                    break;
                case 3:
                    triangleTop(scanner);
                    break;
            }
        } while (choice != 0);
    }

    public static void rectangle(Scanner scanner) {
        System.out.println("Nhập vào chiều dài:");
        int height = scanner.nextInt();
        System.out.println("Nhập vào chiều rộng:");
        int width = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleBottom(Scanner scanner) {
        System.out.println("Nhập vào chiều cao tam giác: ");
        int height = scanner.nextInt();

        for (int i = 1; i < height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangleTop(Scanner scanner) {
        System.out.println("Nhập vào chiều cao tam giác: ");
        int height = scanner.nextInt();

        for (int i = height; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

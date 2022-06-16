package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnimalManage animalManage = new AnimalManage();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm Animal");
            System.out.println("Nhập lựa chọn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    addAnimalByMain(animalManage, scanner);
                }
                break;
            }
        }while (choice != 0);
    }

    private static void addAnimalByMain(AnimalManage animalManage, Scanner scanner) {
        System.out.println("Chọn loại Animal muốn tạo");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("Nhập lựa chọn:");
        int choice2 = Integer.parseInt(scanner.nextLine());
        switch (choice2){
            case 1:
                animalManage.addAnimal(scanner, 1);
                break;
            case 2:
                animalManage.addAnimal(scanner, 2);
                break;
            default:
                System.out.println("Không có loại Animal vừa chọn!");
        }
    }
}

package oop;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalManage {
    private ArrayList<Animal> animals ;

    public AnimalManage() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Scanner scanner, int type) {
        Animal animal;
        System.out.println("Nhập vào tên Animal:");
        String name = scanner.nextLine();
        System.out.println("Nhập vào tuổi Animal:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính Animal:");
        String gender = scanner.nextLine();
        if (type == 1) {
           animal = new Dog(name, age, gender);
        } else {
            System.out.println("Nhập vào màu sắc của Animal:");
            String color = scanner.nextLine();
            animal = new Cat(name, age, gender, color);
        }
        animals.add(animal);
        System.out.println(animals);

        for (Animal a : animals) {
            if (a instanceof Dog) {
                Dog dog = (Dog) a;
                dog.run("hihi");
            }
        }
    }
}

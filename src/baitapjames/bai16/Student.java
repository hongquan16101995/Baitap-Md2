package baitapjames.bai16;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display() {
        System.out.printf("%-10s%-5s%s", name, age, address + "\n");
    }
}

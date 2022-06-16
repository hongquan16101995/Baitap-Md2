package oop;

public class Dog extends Animal{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void run() {
        System.out.println("Dog running");
    }

    void run(String demo) {
        System.out.println("Dog running" + demo);
    }

    String run(String demo, int number) {
        return demo;
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

package oop;

//create class
public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    @Override
    public void run() {
        System.out.println("Cat running");
    }

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

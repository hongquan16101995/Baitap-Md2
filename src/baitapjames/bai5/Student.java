package baitapjames.bai5;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String setClasses(String classes) {
        this.classes = classes;
        return this.classes;
    }
}

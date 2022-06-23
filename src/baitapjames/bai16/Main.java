package baitapjames.bai16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\ADMIN\\Desktop\\Theory\\C0422H1\\Module2\\BaiTap-Md2\\src\\baitapjames\\bai16\\demo.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String value;
            while ((value = bufferedReader.readLine()) != null) {
                String[] strings = value.split(",");
                Student student = new Student(strings[0], Integer.parseInt(strings[1]), strings[2]);
                students.add(student);
            }
        } catch (IOException e) {
            System.out.println("Lỗi");
        }

        for (Student student : students) {
            student.display();
        }
    }
}

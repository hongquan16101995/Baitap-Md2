package hethong;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("SmartPhone");
        Category category2 = new Category("Tablet");
        Category category3 = new Category("Laptop");
        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product("iphone", 1000, "hihi", category1);
        System.out.println(product1);
    }
}

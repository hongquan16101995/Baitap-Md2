package baitapoop.bai4;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TownManager townManager = new TownManager();
        Town town = townManager.createTown(scanner);
        System.out.println(town);
    }
}

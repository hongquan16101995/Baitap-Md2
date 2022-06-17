package baitapjames.bai2;

public class Ex3 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int number = 0;
        while (number < 100) {
            if (Ex2.isPrime(number)){
                System.out.print(number + "; ");
            }
            number++;
        }
    }
}

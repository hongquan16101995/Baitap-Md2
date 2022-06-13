package bai2;

public class Ex2 {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        int count = 0;
        int number = 0;
        while (count < 20) {
            if (isPrime(number)){
                System.out.print(number + "; ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

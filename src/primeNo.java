import java.util.Scanner;

public class primeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for nth prime number: ");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;

        while (true) {
            if (isPrime(num)) {
                count++;
                if (count == n) {
                    System.out.println("The " + n + "th prime number is: " + num);
                    break;
                }
            }
            num++;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class formatProduct {

    public static String formatProduct(int a, int b) {
        BigInteger product = BigInteger.ONE;

        // Multiply numbers from a to b
        for (int i = a; i <= b; i++) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        // Count trailing zeroes
        int count = 0;
        while (product.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            product = product.divide(BigInteger.TEN);
            count++;
        }

        // Return in format D*10^E
        return product.toString() + "*10^" + count;
    }

    public static void main(String[] args) throws IOException {
        // Reading input using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine(); // e.g. "3 10"

        String[] parts = input.trim().split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // Output the result
        System.out.println(formatProduct(a, b));
    }
}

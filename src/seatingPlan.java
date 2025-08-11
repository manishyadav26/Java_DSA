import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class seatingPlan {

    // Function to generate valid binary strings with no two '1's adjacent
    public static List<String> generateValidBinaries(int requiredCount) {
        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // Start from '1', as per given pattern

        while (result.size() < requiredCount) {
            String current = queue.poll();
            result.add(current);

            // Append '0' always
            queue.add(current + "0");

            // Append '1' only if last char is '0'
            if (current.charAt(current.length() - 1) == '0') {
                queue.add(current + "1");
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        // Input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Number of test cases

        String[] input = br.readLine().trim().split("\\s+");
        int[] queries = new int[t];
        int maxIndex = 0;

        for (int i = 0; i < t; i++) {
            queries[i] = Integer.parseInt(input[i]);
            maxIndex = Math.max(maxIndex, queries[i]);
        }

        // Generate valid binary strings up to max required index
        List<String> validSeatings = generateValidBinaries(maxIndex);

        // Output the corresponding seating for each query
        for (int i = 0; i < t; i++) {
            System.out.println(validSeatings.get(queries[i] - 1)); // -1 since list is 0-indexed
        }
    }
}

import java.util.List;

public class RandomListGenerator{
    public static void main(String[] args) {
        int size = 10; // Specify the size of the list
        int min = 1;   // Minimum value for the random integers
        int max = 100; // Maximum value for the random integers

        try {
            // Generate a random list
            List<Integer> randomList = generateRandomList(size, min, max);
            System.out.println("Generated random list: " + randomList);
        } catch (IllegalArgumentException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
} 
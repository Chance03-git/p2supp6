import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomListGenerator{
    /**
     * Generates a list of random integers.
     * 
     * @param size The number of integers in the list.
     * @param min  The minimum value for the random integers.
     * @param max  The maximum value for the random integers.
     * @return A list of random integers.
     * @throws IllegalArgumentException If size is negative or min is greater than max.
     */
    public static List<Integer> generateRandomList(int size, int min, int max) {
        if (size < 0) {
            throw new IllegalArgumentException("Size must be non-negative.");
        }
        if (min > max) {
            throw new IllegalArgumentException("Minimum value cannot be greater than maximum value.");
        }

        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(max - min + 1) + min; // Generate random number in range [min, max]
            randomList.add(randomNumber);
        }

        return randomList;
    }
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
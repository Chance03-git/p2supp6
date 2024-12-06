import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class IntegerFrequencyMap {
  public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);

        // Calculate frequency map
        Map<Integer, Integer> frequencyMap = getFrequencyMap(numbers);

        // Print the result
        System.out.println("Input list: " + numbers);
        System.out.println("Frequency map: " + frequencyMap);
    }
}

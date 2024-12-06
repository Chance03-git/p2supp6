import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntegerFrequencyMap {
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        return frequencyMap;
    }
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

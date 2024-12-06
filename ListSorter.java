import java.util.ArrayList;
import java.util.List;

public class ListSorter {
    public static void main(String[] args) {
        // Example list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        // Sort the list
        List<Integer> sortedList = sortListAscending(numbers);

        // Print the original and sorted lists
        System.out.println("Original list: " + numbers);
        System.out.println("Sorted list: " + sortedList);
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorter {
    /**
     * Sorts a list of integers in ascending order.
     * 
     * @param numbers The list of integers to sort.
     * @return A new list with integers sorted in ascending order.
     */
    public static List<Integer> sortListAscending(List<Integer> numbers) {
            List<Integer> sortedList = new ArrayList<>(numbers); // Create a copy to avoid modifying the original list
            Collections.sort(sortedList); // Sort the list in ascending order
            return sortedList;
        }
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


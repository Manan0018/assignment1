import java.util.*;

public class part2task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 12, 7, 18, 3, 10, 25, 8, 15, 2));

        // Remove even numbers
        list.removeIf(n -> n % 2 == 0);

        // Max & Min
        int max = Collections.max(list);
        int min = Collections.min(list);

        // Sort descending
        list.sort(Collections.reverseOrder());

        System.out.println("Final List: " + list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

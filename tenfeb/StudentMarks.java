import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        // Add 5 marks
        marks.add(78);
        marks.add(85);
        marks.add(67);
        marks.add(90);
        marks.add(72);

        // Insert mark at index 2
        marks.add(2, 88);

        // Remove lowest mark
        int min = Collections.min(marks);
        marks.remove(Integer.valueOf(min));

        // Display final list
        System.out.println("Final Marks: " + marks);
    }
}
 
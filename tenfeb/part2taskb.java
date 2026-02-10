import java.util.*;

public class part2taskb {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Patient1");
        queue.add("Patient2");
        queue.add("Patient3");
        queue.add("Patient4");
        queue.add("Patient5");

        // Emergency patient at front
        queue.addFirst("EmergencyPatient");

        // Remove 2 treated patients
        queue.removeFirst();
        queue.removeFirst();

        System.out.println("Current Queue: " + queue);
    }
}

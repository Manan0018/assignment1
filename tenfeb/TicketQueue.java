import java.util.*;

public class TicketQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        // Add 5 customers
        queue.add("Aman");
        queue.add("Riya");
        queue.add("Karan");
        queue.add("Simran");
        queue.add("Rohit");

        // Remove 2 customers
        queue.removeFirst();
        queue.removeFirst();

        // Display remaining queue
        System.out.println("Remaining Queue: " + queue);
    }
}

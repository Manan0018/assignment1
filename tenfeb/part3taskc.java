class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class SLL {
    Node head;

    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return;  // position out of range

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByValue(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    int countNodes() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void findMiddle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow != null)
            System.out.println("Middle: " + slow.data);
    }

    void reverse() {
        Node prev = null, curr = head, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class part3taskc {
    public static void main(String[] args) {
        SLL list = new SLL();

        list.insertAtPosition(10, 0);
        list.insertAtPosition(20, 1);
        list.insertAtPosition(30, 2);
        list.insertAtPosition(25, 2); // insert in middle

        System.out.print("List: ");
        list.display();

        System.out.println("Total Nodes: " + list.countNodes());

        list.findMiddle();

        list.deleteByValue(20);
        System.out.print("After Deletion: ");
        list.display();

        list.reverse();
        System.out.print("After Reverse: ");
        list.display();
    }
}

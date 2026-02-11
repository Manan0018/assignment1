class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }


    int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int popped = top.data;
        top = top.next;
        return popped;
    }

 
    int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

   
    boolean isEmpty() {
        return top == null;
    }
}

public class maiin{
    public static void main(String[] args) {

        Stack s = new Stack();   

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());

        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());

        System.out.println("Top element: " + s.peek());

        System.out.println("Is Empty? " + s.isEmpty());
    }
}
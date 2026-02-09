class Student {
    int rollNo;
    String name;
    int subject1;
    int subject2;
    int subject3;

    Student(int rollNo, String name, int subject1, int subject2, int subject3) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    void display() {
        System.out.println(
            rollNo + " " + name +
            " | Sub1: " + subject1 +
            " Sub2: " + subject2 +
            " Sub3: " + subject3
        );
    }
}

public class SelectionSortObjects {

    static boolean shouldSwap(Student s1, Student s2) {

        if (s1.subject1 > s2.subject1) return true;
        if (s1.subject1 < s2.subject1) return false;

        if (s1.subject2 > s2.subject2) return true;
        if (s1.subject2 < s2.subject2) return false;

        return s1.subject3 > s2.subject3;
    }

    static void selectionSort(Student[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                // find smaller student
                if (shouldSwap(arr[minIndex], arr[j])) {
                    minIndex = j;
                }
            }

            // swap
            Student temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Amit", 80, 70, 60),
            new Student(2, "Riya", 80, 70, 55),
            new Student(3, "Neha", 75, 90, 85),
            new Student(4, "Rahul", 80, 70, 90),
            new Student(5, "John", 75, 60, 70)
        };

        selectionSort(students);

        for (Student s : students) {
            s.display();
        }
    }
}

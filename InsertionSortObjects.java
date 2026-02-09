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

public class InsertionSortObjects {

    static boolean shouldSwap(Student s1, Student s2) {

        if (s1.subject1 > s2.subject1) return true;
        if (s1.subject1 < s2.subject1) return false;

        if (s1.subject2 > s2.subject2) return true;
        if (s1.subject2 < s2.subject2) return false;

        return s1.subject3 > s2.subject3;
    }

    static void insertionSort(Student[] arr) {

        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            // shift larger students right
            while (j >= 0 && shouldSwap(arr[j], key)) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
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

        insertionSort(students);

        for (Student s : students) {
            s.display();
        }
    }
}

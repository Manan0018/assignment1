class Student {
    int rollNo;
    String name;
    int[] subjects; 

    Student(int rollNo, String name, int[] subjects) {
        this.rollNo = rollNo;
        this.name = name;
        this.subjects = subjects;
    }

    void display() {
        System.out.println(
            rollNo + " " + name +
            " | " + subjects[0] +
            " " + subjects[1] +
            " " + subjects[2]
        );
    }
}

public class BubbleSortStudents {

    static void bubbleSort(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (shouldSwap(arr[j], arr[j + 1])) {
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static boolean shouldSwap(Student s1, Student s2) {

        
        for (int i = 0; i < s1.subjects.length; i++) {
            if (s1.subjects[i] > s2.subjects[i]) return true;
            if (s1.subjects[i] < s2.subjects[i]) return false;
        }

        return false;
    }

    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Amit",  new int[]{80, 70, 60}),
            new Student(2, "Riya",  new int[]{80, 70, 55}),
            new Student(3, "Neha",  new int[]{75, 90, 85}),
            new Student(4, "Rahul", new int[]{80, 70, 90}),
            new Student(5, "John",  new int[]{75, 60, 70})
        };

        bubbleSort(students);

        for (Student s : students) {
            s.display();
        }
    }
}
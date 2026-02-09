class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}


public class Main {

    public static void bubbleSort(Student[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {

        
                if (arr[j].marks > arr[j + 1].marks) {

                    // swap objects
                    Student temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; // optimization
        }
    }

    public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Aman", 72.5),
            new Student(2, "Riya", 88.0),
            new Student(3, "Kunal", 65.0),
            new Student(4, "Sara", 91.0)
        };

        bubbleSort(students);

        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);
        }
    }
}

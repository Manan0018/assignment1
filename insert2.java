class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
    }
}


public class insert2 {
  public static void insertionSort(Student[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].marks > key.marks) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Amit", 85),
            new Student(2, "Riya", 72),
            new Student(3, "John", 90),
            new Student(4, "Neha", 78)
        };

        insertionSort(students);

        for (Student s : students) {
            s.display();
        }
    }
}

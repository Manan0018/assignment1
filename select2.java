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



public class select2 {
  public static void selectionSort(Student[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j].marks < arr[minIndex].marks) {
                    minIndex = j;
                }
            }

            Student temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student(1, "Amit", 85),
            new Student(2, "Riya", 72),
            new Student(3, "John", 90),
            new Student(4, "Neha", 78)
        };

        selectionSort(students);

        for (Student s : students) {
            s.display();
        }
    }
}

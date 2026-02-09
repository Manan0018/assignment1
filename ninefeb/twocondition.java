class Student {
    int rollNumber;
    String name;
    double marks;

    Student(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }
}



public class twocondition {
  public static void bubbleSort(Student[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        boolean swapped = false;

        for (int j = 0; j < n - i - 1; j++) {

            // 🔥 Condition 1: Higher marks should come later
            if (arr[j].marks > arr[j + 1].marks ||

               // 🔥 Condition 2: If marks same, sort by roll number
               (arr[j].marks == arr[j + 1].marks &&
                arr[j].rollNumber > arr[j + 1].rollNumber)) {

                // swap objects
                Student temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

                swapped = true;
            }
        }

        if (!swapped) break;
    }
}
public static void main(String[] args) {

        Student[] students = {
            new Student(1, "Aman", 72.5),
            new Student(2, "Riya",72.5),
            new Student(3, "Kunal", 65.0),
            new Student(4, "Sara", 91.0)
        };

        bubbleSort(students);

        for (Student s : students) {
            System.out.println(s.name + " " + s.marks);
        }
    }

}

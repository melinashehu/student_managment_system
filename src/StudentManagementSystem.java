import java.util.ArrayList;
import java.util.Scanner;

class StudentManagementSystem {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Student student;
        while (true) {
            System.out.println("Welcome here is the list of actions");
            System.out.println("1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. Generate Reports");
            System.out.println("4. Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter student name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter student age: ");
                    int age = scan.nextInt();
                    String course = scan.nextLine();
                    System.out.println("1.Undergraduate/n 2.Graduate/n or /n3.Phd.: ");
                    int type = scan.nextInt();
                    switch (type) {
                        case 1:
                            student = new UndergraduateStudent(name, age,course );
                            break;
                        case 2:
                            student = new GraduateStrudent(name, age,course);
                            break;
                        case 3:
                            student = new Phd(name, age,course);
                            break;
                        default:
                            System.out.println("Invalid student type!");
                            continue;
                    }
                    students.add(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:

                    System.out.println("Select a student to mark attendance:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println(i + 1 + ". " + students.get(i).name);
                    }
                    int studentIndex = scan.nextInt() - 1;
                    System.out.print("Enter days present: ");
                    int daysPresent = scan.nextInt();
                    System.out.print("Enter days absent: ");
                    int daysAbsent = scan.nextInt();
                    students.get(studentIndex).Attendance(daysPresent, daysAbsent);
                    System.out.println("Attendance marked successfully!");
                    break;
                case 3:
                    System.out.println("Student Reports:");
                    for (Student s : students) {
                        s.displayReport();
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");


            }
        }
    }
}

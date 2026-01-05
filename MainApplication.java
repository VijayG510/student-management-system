import java.util.Scanner;
public class MainApplication {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        int choice;
        do{
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Student ID: ");
                    int studentId = scanner.nextInt();

                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.next();

                    System.out.print("Enter Student Age: ");
                    int studentAge = scanner.nextInt();

                    System.out.print("Enter Department: ");
                    String studentDepartment = scanner.next();

                    Student student = new Student(studentId, studentName, studentAge, studentDepartment);
                    studentService.addStudent(student);
                    break;
                case 2:
                    studentService.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    studentService.searchStudentById(searchId);
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = scanner.nextInt();
                    studentService.deleteStudentById(deleteId);
                    break;
                case 5:
                    System.out.println("Thank you for using the system.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        while(choice != 5);
        scanner.close();
    }
}

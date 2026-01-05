import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class StudentService {
    private List<Student> studentList = new ArrayList<>();

    //Add student
    public void addStudent(Student student){
        studentList.add(student);
        System.out.println("Student added succussfully.");
    }
    //View all students
    public void displayAllStudents(){
        if(studentList.isEmpty()){
            System.out.println("No students available.");
        }else{
            for(Student student : studentList){
                System.out.println(student);
            }
        }
    }
    // Search student by ID
    public void searchStudentById(int studentId){
        boolean found = false;

        for(Student student : studentList){
            if(student.getStudentId() == studentId){
                System.out.println(student);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Student not found.");
        }
    }
    //Delete student by ID
    public void deleteStudentById(int studentId){
        Iterator<Student> iterator = studentList.iterator();
        boolean removed = false;

        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getStudentId() == studentId){
                iterator.remove();
                removed = true;
                System.out.println("Student deleted successfully.");
                break;
            }
        }
        if(!removed){
            System.out.println("Student not found.");
        }
    }
}

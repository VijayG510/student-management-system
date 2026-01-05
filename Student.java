public class Student{
    private int studentId;
    private String studentName;
    private int studentAge;
    private String studentDepartment;

    //Constructor
    public Student(int studentId, String studentName, int studentAge, String studentDepartment){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentDepartment = studentDepartment;
    }
    
    //Getters
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public String getStudentDepartment(){
        return studentDepartment;
    }

    @Override
    public String toString(){
        return "Student ID: "+studentId+", Name: "+studentName+", Age: "+studentAge+", Department: "+studentDepartment;
    }
}
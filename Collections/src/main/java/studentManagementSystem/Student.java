package studentManagementSystem;

public class Student {
    private int studentID;
    private String studentName;
    private int studentGPA;

    public Student(int studentID, String studentName, int studentGPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentGPA = studentGPA;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentGPA() {
        return studentGPA;
    }

    public void setStudentGPA(int studentGPA) {
        this.studentGPA = studentGPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentGPA=" + studentGPA +
                '}';
    }
}

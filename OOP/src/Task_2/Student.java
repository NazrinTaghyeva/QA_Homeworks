package Task_2;

public class Student extends Person{
    private int studentId;

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    void displayInfo() {
        System.out.println("Student Id " + studentId);
    }
}

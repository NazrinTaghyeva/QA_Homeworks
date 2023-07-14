package studentManagementSystem;

import java.util.HashMap;

public class StudentRecordSystem {
    private HashMap<Integer, Student> students;

    public StudentRecordSystem() {
        students = new HashMap<>();
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<Integer, Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentID(), student);
        System.out.println("Student SuccessFully Added:)");
    }

    public void removeStudent(int id) {
        students.remove(id);
    }

    public Student retrieveStudent(int id) {
        return students.get(id);
    }

    public void printAllStudents() {
        for (Student student : students.values()) {
            System.out.println("Student ID: " + student.getStudentID() + ",Student Name: " + student.getStudentName() + ",Student GPA: " + student.getStudentGPA());
        }
    }
}

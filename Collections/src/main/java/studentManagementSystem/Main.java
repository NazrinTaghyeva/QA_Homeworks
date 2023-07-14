package studentManagementSystem;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Nazryn", 90);
        Student student2 = new Student(2, "Sherlock", 100);
        StudentRecordSystem studentRecordSystem = new StudentRecordSystem();
        //Add Students
        studentRecordSystem.addStudent(student1);
        studentRecordSystem.addStudent(student2);
        //Print All Students
        System.out.println("************************* Print All Students ****************************");
        studentRecordSystem.printAllStudents();
        //Remove Students
        System.out.println("************************** Remove Students ******************************");
        studentRecordSystem.removeStudent(2);
        studentRecordSystem.printAllStudents();
        //Retrieve Students
        System.out.println("**************************** Retrieve Students ***************************");
        Student st = studentRecordSystem.retrieveStudent(1);
        System.out.println(st.toString());
    }
}

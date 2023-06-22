package OOP_Task_2;

public class Main {
    public static void main(String[] args) {
     Student student = new Student("Nazryn",20,100);
     String studentInformation = student.toString();
     System.out.println(studentInformation);
     // If we want information just methods should be write :) :
        System.out.println("Hi,I am " + student.getStudentName() + ",my age is " + student.getStudentAge() +" and so my grade is " + student.getStudentGrade() + " :)");
    }
}

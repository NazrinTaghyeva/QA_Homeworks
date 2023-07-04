package Task_6;

public class Manager extends Employee{
    private String department;

    public Manager(String employeeName, double employeeSalary,String department) {
        super(employeeName, employeeSalary);
        this.department = department;
    }

    @Override
    public void getDetails() {
        System.out.println("Manager name is: "+ super.getEmployeeName() + ",Salary is: " + super.getEmployeeSalary() + ",Department is: " + this.department);
    }

}
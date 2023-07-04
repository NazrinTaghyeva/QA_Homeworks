package Task_6;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String employeeName, double employeeSalary,String programmingLanguage) {
        super(employeeName, employeeSalary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void getDetails() {
        System.out.println("Developer name is: "+ super.getEmployeeName() + ",Salary is: " + super.getEmployeeSalary() + ",Department is: " + this.programmingLanguage);
    }
}

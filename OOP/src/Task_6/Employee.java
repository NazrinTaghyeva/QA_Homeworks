package Task_6;

public abstract class Employee {
    private String employeeName;
    private double employeeSalary;

    public Employee(String employeeName, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
    public  abstract void getDetails();

}

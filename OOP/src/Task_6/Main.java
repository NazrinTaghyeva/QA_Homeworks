package Task_6;

public class Main {
    public static void main(String[] args) {
        Employee employees[] =
                {
                        new Manager("Kate",2500.50,"Manager"),
                        new Developer("Nazryn",2000,"Information Technologies")
                };
        for (int i = 0; i< employees.length;i++){
            Employee employee = employees[i];
            employee.getDetails();
        }
    }
}

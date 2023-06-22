package OOP_Task_1;

public class Main {
    public static void main(String[] args) {
        Car car =new Car();
        car.startEngine();
        car.drive();
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.drive();
        motorCycle.startEngine();
        Truck truck = new Truck();
        truck.drive();
        truck.startEngine();
    }
}

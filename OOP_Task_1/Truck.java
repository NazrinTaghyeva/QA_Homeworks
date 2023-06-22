package OOP_Task_1;

public class Truck extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Truck is starting...");
    }

    @Override
    void drive() {
        System.out.println("Truck is driving...");
    }
}

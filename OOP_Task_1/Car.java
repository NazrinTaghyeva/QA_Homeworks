package OOP_Task_1;

public class Car extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("Car is starting....");
    }

    @Override
    void drive() {
        System.out.println("Car is driving....");
    }
}

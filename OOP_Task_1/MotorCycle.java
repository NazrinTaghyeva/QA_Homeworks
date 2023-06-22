package OOP_Task_1;

public class MotorCycle extends Vehicle{
    @Override
    void startEngine() {
        System.out.println("MotorCycle is starting...");
    }

    @Override
    void drive() {
        System.out.println("MotorCycle is driving...");
    }
}

package Task_4;

public class ConsoleLogger implements Logger {
    @Override
    public void logInfo(String msg) {
        System.out.println("Console Logger<----->LogWarning: " + msg);
    }

    @Override
    public void logWarning(String msg) {
        System.out.println("Console Logger<----->LogWarning: " + msg);
    }

    @Override
    public void logError(String msg) {
        System.out.println("Console Logger<----->LogWarning: " + msg);
    }
}

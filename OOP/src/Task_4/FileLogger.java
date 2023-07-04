package Task_4;

public class FileLogger implements Logger {
    @Override
    public void logInfo(String msg) {
        System.out.println("File Logger<----->LogInfo: " + msg);
    }

    @Override
    public void logWarning(String msg) {
        System.out.println("File Logger<----->LogWarning: " + msg);
    }

    @Override
    public void logError(String msg) {
        System.out.println("File Logger<----->LogError: " + msg);
    }
}

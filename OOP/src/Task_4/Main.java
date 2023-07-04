package Task_4;

public class Main {
    public static void main(String[] args) {
     Logger logger[] = {new ConsoleLogger(),new FileLogger()};
     for (int i = 0 ; i<logger.length;i++){
         Logger log = logger[i];
         log.logError("This is Log Error message...");
         log.logInfo("This is Log Info...");
         log.logWarning("This is Log Warning message...");
     }
    }
}

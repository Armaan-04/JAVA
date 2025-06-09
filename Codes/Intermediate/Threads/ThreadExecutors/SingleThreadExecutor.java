package Codes.Intermediate.Threads.ThreadExecutors;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class SingleThreadExecutor {
    public static void main(String[] args) {
       try( ExecutorService service = Executors.newSingleThreadExecutor()){
           PrintNumbers task = new PrintNumbers();
           service.submit(task);
       }
    }
}

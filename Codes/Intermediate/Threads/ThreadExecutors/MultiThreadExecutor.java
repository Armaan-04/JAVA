package Codes.Intermediate.Threads.ThreadExecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadExecutor {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(5)) {//creating an executor service.
            for (int i = 0; i < 10; i++) {
                SleepTask task = new SleepTask();
                service.submit(task);
            }
            service.shutdown();

                if (!service.awaitTermination(10 , TimeUnit.SECONDS)){
                    System.out.println("EMERGENCY SHUTDOWN.");
                    service.shutdownNow();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


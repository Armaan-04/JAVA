package Codes.Intermediate.Threads.ThreadExecutors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class TestingFactorialUsingThreads {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>(); //stores the result.
            //^List of type future of type integer.
            for (int i = 0; i < 10; i++) {
                FactorialCalculator task = new FactorialCalculator(i);
                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) { //for each loop to get the stored elements.
                System.out.printf("\nResult is %d ", future.get());
            }

            service.shutdown();

            if(!service.awaitTermination(10,TimeUnit.SECONDS)) {
                System.out.println("\nShutdown complete");
                service.shutdown();
            }
            } catch(InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
    }

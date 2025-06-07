package Codes.Intermediate.Threads;

public class HelloThreads extends Thread {
    private final int threadNumber;

    public HelloThreads(int threadNumber){
        this.threadNumber = threadNumber;
    }

    public void run(){
        for (int i=0 ; i<10; i++){
            System.out.printf("(%d) %s Hello from Thread-%d.\n " , (i+1) ,
                    Thread.currentThread().getName() , threadNumber);
        }
    }
}

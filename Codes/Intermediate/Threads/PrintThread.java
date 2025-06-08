package Codes.Intermediate.Threads;

public class PrintThread extends Thread{
    private final int ThreadNumber;

    public PrintThread(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }

    @Override
    public void run() {
        System.out.printf("%s Starting Thread-%d\n" ,
                Thread.currentThread().getName() , ThreadNumber);
        try {
            Thread.sleep(5000);
        } catch(InterruptedException exception){
            throw new RuntimeException();
        }
        System.out.printf("%s Ended Thread-%d\n" ,
                Thread.currentThread().getName() , ThreadNumber);
    }
}

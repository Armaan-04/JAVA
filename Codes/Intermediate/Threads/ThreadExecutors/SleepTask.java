package Codes.Intermediate.Threads.ThreadExecutors;

public class SleepTask implements Runnable{
    @Override
    public void run() {
        Thread current = Thread.currentThread(); //Thread Object.
        System.out.printf("Started with thread: %s\n", current.getName());
        try {
            Thread.sleep(getRandom() * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended with thread: %s\n " , current.getName());
    }

    private int getRandom(){
        double random = Math.random() * 5 + 1; //random generates a no. b/w 0 and 1...+1 is to include 1 as well...required value is supposed to be between 1 and 5.
        return (int) random; //loses the point part.
    }
}

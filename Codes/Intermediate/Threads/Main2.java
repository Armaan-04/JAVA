package Codes.Intermediate.Threads;

public class Main2 {
    public static void main(String[] args) throws InterruptedException{
        ThreadState t1 = new ThreadState();
        System.out.printf("\nCreated the thread %s" ,t1.getState());
        t1.start();
        t1.join(); //method waits until t1 is finished.
        System.out.printf("\nThread finished %s" ,
                t1.getState());
    }
}

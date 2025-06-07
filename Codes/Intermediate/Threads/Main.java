package Codes.Intermediate.Threads;

public class Main {
    public static void main(String[] args) {
        HelloThreads t1 = new HelloThreads(1);
        HelloThreads t2 = new HelloThreads(2);

        t1.start();
        t2.start();
    }
}
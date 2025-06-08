package Codes.Intermediate.Threads;

public class Main4 {
    public static void main(String[] args) throws InterruptedException{
        TrafficSignal red = new TrafficSignal(TrafficColor.RED);
        TrafficSignal yellow= new TrafficSignal(TrafficColor.YELLOW);
        TrafficSignal green = new TrafficSignal(TrafficColor.GREEN);

        red.start();
        red.join();
        yellow.start();
        yellow.join();
        green.start();
    }
}

package Codes.Intermediate.Threads;

public class TrafficSignal extends Thread{
        private final TrafficColor color;

        public TrafficSignal(TrafficColor color){
            this.color = color;
        }

    @Override
    public void run() {
        System.out.printf("%s active\n" , color);
        try{
            Thread.sleep(color.getOnTimeInMills());
        } catch (InterruptedException exception){
            throw new RuntimeException(exception);
        }
        System.out.printf("%s Inactive\n" , color);
    }
}


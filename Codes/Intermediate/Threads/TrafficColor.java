package Codes.Intermediate.Threads;

public enum TrafficColor {
    RED(6000),
    YELLOW(2000),
    GREEN(4000);

    private final int OnTimeInMills;
    public int getOnTimeInMills() {
        return OnTimeInMills;
    }

    TrafficColor(int OnTimeInMills){
        this.OnTimeInMills = OnTimeInMills;
    }
}

package Codes.Intermediate.OOPS.Library;

public class DVD extends LibraryItem {

    private int DurationInSeconds;

    public DVD (int DurationInSeconds) {
        this.DurationInSeconds = DurationInSeconds;
    }
    public void duration(){
            System.out.println("The duration is " + DurationInSeconds + " seconds." );
        }
    }


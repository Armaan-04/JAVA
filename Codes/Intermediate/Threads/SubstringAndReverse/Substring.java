package Codes.Intermediate.Threads.SubstringAndReverse;
import java.util.*;

public class Substring extends Thread {
    String str;
    Scanner sc = new Scanner(System.in);

    Substring() {
        System.out.println("Enter a string");
        str = sc.next();
    }

    public void run() {
        try {
            for (int i = 0; i <= str.length(); i++) {
                System.out.println("Task-1: " + str.substring(0 , i+1));
                Thread.sleep(500);
            }
        } catch(InterruptedException e) {
            System.out.println("Task-1 interrupted");
        }
    }
}

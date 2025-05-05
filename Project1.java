import java.util.Scanner;
public class Project1{
    public static void main(String[] args) {

    // s = u * t + 1/2 *a *t *t

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the initial velocity (u): ");
    double velocity = scanner.nextDouble();
    System.out.println("Please enter the time (t): ");
    double time = scanner.nextDouble();
    System.out.println("Please enter the acceleration (a): ");
    double acceleration = scanner.nextDouble();

    double distance = (velocity * time + (0.5 * acceleration * Math.pow(time,2)));
    System.out.println("The distance travelled is: " + distance);
    
}
}
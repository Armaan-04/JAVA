import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {

        // s = u * t + 1/2 *a *t *t

        Scanner scanner = new Scanner(System.in);
        double velocity=0;
        while (velocity>=0){
            System.out.println("Please enter the velocity(v): ");
            velocity = scanner.nextDouble();


            while(velocity<0){
                System.out.println("Please enter a postive value: " );
                velocity =  scanner.nextDouble();
                break;
            }
            break;
        }



        double time=0;
        while (time>=0){
            System.out.println("Please enter the time(t): ");
            time = scanner.nextDouble();


             while(time<0){
                 System.out.println("Please enter a postive value: " );
                 time =  scanner.nextDouble();
                 break;
            }
        break;
        }

        double acceleration=0;
        while (acceleration>=0){
            System.out.println("Please enter the acceleration(a): ");
            acceleration = scanner.nextDouble();


            while(acceleration<0){
                System.out.println("Please enter a postive value: " );
                acceleration =  scanner.nextDouble();
                break;
            }
            break;
        }


        double distance = (velocity * time + (0.5 * acceleration * Math.pow(time,2)));
        System.out.println("The distance travelled is: " + distance);

    }
}
package Introduction;
import java.util.Arrays;

public class arrays{
    public static void main(String[] args) {
        int[] marks = new int[] {20,10,40,50};
        System.out.println(marks[2]);
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));


        int[][] NewMarks = new int[][] {{50,55},{90,30}};
        System.out.println(NewMarks[0][1]); //0th position and then 1st position.
        System.out.println(Arrays.deepToString(NewMarks));
        
        }
    }

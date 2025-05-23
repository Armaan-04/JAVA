package Codes;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int rows = input.nextInt();
        Pattern1(rows);
        Pattern2(rows);
        Pattern3(rows);
    }

    public static void Pattern2(int maxRows ){
        System.out.println("\nHere is pattern2.");
        for(int i =maxRows ; i>=1 ; i--){
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern1(int maxRows){
        System.out.println("\nHere is pattern 1.");
        for(int i=1 ; i<=maxRows ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(int maxRows){
        System.out.println("\nHere is Pattern 3.");
        for(int i=1 ; i<=maxRows ; i++){ //for row (i loop)
            for(int k = maxRows-1 ; k>=i ; k--){ //loop for space
                System.out.print(" ");
            }
            for(int j=1 ; j<=i ; j++){ //column loop
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


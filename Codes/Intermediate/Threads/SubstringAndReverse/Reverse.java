package Codes.Intermediate.Threads.SubstringAndReverse;

import java.util.Scanner;

public class Reverse extends Thread{
    String[] str;
    StringBuilder sb;
    int n;

    Reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Task-2: Enter number of Strings:");
        n = sc.nextInt();
        str = new String[n];

        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter string " + (i+1) + " : ");
            str[i] = sc.next();
        }
    }

    public void run(){
        try{
            for(int i =0 ; i<n ; i++){
                sb = new StringBuilder(str[i]);
                System.out.println("Task-2: " + sb.reverse());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Task-2 interrupted.");
        }
    }
}

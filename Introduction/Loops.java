package Introduction;

public class Loops{
    public static void main(String[] args){
        int a = 5;
        while(a<10){
            System.out.println(a);
            a++;
        }

        for (int b = 10; b>0 ; b--){
            System.out.println(b);
        }

        int[] marks = new int[]{1 , 2, 3, 4};
        for (int i=0 ; i<=3 ; i++){
            System.out.println(marks[i]);
        }

        int c=5;
        do {
            System.out.println(c);
            c++;
        } while(c<10);

        int x =5;
        while (x!=10) {
            x++;
            if (x == 8)
                continue; //loop starts again without entering the next statement
            System.out.println(x);
        }

    }
}
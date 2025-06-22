package Codes.Intermediate.Miscellaneous;

public class EasyCalculator {
    public int add(int first , int second){
        return first + second;
    }

    public int add(int first , int second , int third){
        return first + second + third;
    }

    public double add(double first , double second){
        return first + second;
    }

    public static void main(String[] args){
        EasyCalculator calc = new EasyCalculator();
        System.out.println(calc.add(5,6));
        System.out.println(calc.add(2,4,7));
        System.out.println(calc.add(5.6,3.2));
    }
}

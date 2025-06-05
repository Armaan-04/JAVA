package Codes.Intermediate;

public class ConcatenateStrings {

    public static void main(String[] args) {
        System.out.println(concatenate("Armaan"));
        System.out.println(concatenate("Alam"));
        System.out.println(concatenate("Likes" , "to" , "play" , "football"));
    }
    public static String concatenate(String...strs){ //this is how to use variable arguments
       StringBuilder sb = new StringBuilder();
       for (String str : strs){
           sb.append(str).append(" ");
       }
       return sb.toString();
    }
}

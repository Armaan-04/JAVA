package Introduction;

public class strings{
    public static void main(String[] args){
        String a = "This is my test string";
        String b = "Value 1";

        System.out.println(b.contains("al"));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        System.out.println(a.startsWith("Th"));
        System.out.println(a.endsWith("g")); 
        System.out.println(a.indexOf("test"));
        System.out.println(a.charAt(12));
        System.out.println(a.replace("test" , "final"));
}
}
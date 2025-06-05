package Codes.Intermediate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear" , "Ant" , "Zebra" , "Elephant"); //Arrays.asList is used to make Strings
        System.out.println(list);
        SortInDescending(list);
        System.out.println(list);
    }

    public static void SortInDescending(List<String>StringList){ //this is how comparators are used.
        Collections.sort(StringList, new java.util.Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if(a.equals(b)){//0,-1,1 are treated as ascii values for sorting
                    return 0;
                }else if(a.charAt(0) < b.charAt(0)){
                    return -1;
                }else{
                return 1;
            }
        }

    });

    }
}
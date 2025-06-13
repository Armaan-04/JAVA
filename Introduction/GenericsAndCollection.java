package Introduction;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class GenericsAndCollection {
    public static void main(String[] args){
        //Collection
        //List , Map , Set (these are the data structures under collection)
        List<String> myList = new ArrayList<>();  //List-Linked list form of an array..can be changed according to the requirement
        myList.contains("o"); //checks if the object is present

        Map<String , Long> phonebook = new HashMap<>();
        phonebook.entrySet(); //used for iteration

        Set<String> mySet = new HashSet<>();//duplicate elements cannot be used in Sets , orders are not maintained in a set unlike lists.
        mySet.size(); //checks size of the set.
    }
}

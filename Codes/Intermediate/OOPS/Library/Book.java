package Codes.Intermediate.Library;

public class Book extends LibraryItem{

    private String ISBN;

    public Book (String ISBN){
        this.ISBN=ISBN;
    }

    public void ISBNis (){
        System.out.println("The ISBN of the book is: " + ISBN);
    }
}

package Codes.Intermediate.Library;

public class LibraryItem {

        String itemID;
        String title;
        String author;

        public void checkout () {
            System.out.println("Checkout");
        }

        public void returnItem () {
            System.out.println("Returning the item");
        }
    }
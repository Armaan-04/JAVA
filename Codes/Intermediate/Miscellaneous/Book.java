package Codes.Intermediate.Miscellaneous;

public class Book {
   static int totalNoOfBooks;
   String author;
   String title;
   String ID;
   boolean isBorrowed;

   static{
      totalNoOfBooks=0;
   }
   {//object in it
      totalNoOfBooks++;
   }

   Book(String ID , String title , String author){
      this.ID = ID;
      this.title = title;
      this.author = author;
   }

   Book(String ID){
      this(ID , "Unknown" , "Unknown");
   }

   static int getTotalNoOfBooks(){
      return totalNoOfBooks;
   }

   void BorrowBook(){
      if(isBorrowed){
         System.out.println("Book is already borrowed");
      }else {
         this.isBorrowed = true;
         System.out.println("Enjoy " + this.title);
      }
   }
   void returnBook(){
      if (isBorrowed){
         this.isBorrowed =  false;
         System.out.println("Hope u enjoyed.");
      }else{
         System.out.println("This book is already in the library.");
      }
   }

   public static void main(String[] args) {
      Book DesignOfThings = new Book("1" , "Design" , "Author");
      Book DesignOfShape = new Book("2");
      System.out.println(Book.getTotalNoOfBooks());
      DesignOfThings.BorrowBook();
      DesignOfShape.BorrowBook();
      DesignOfThings.BorrowBook();
      DesignOfThings.returnBook();
      DesignOfThings.returnBook();
   }
}

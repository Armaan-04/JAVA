package Codes.Intermediate.Library;


public class TestClass extends LibraryItem{
    public static void main(String[] args) {
        Book b1 = new Book("AB01");
        b1.ISBNis();

        Magazine m1 = new Magazine("2342");
        m1.issueno();

        DVD d1 = new DVD(678);
        d1.duration();
    }
}

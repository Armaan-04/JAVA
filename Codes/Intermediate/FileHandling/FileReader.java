package Codes.Intermediate.FileHandling;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the file: ");
        String fileName = input.next();

        try (java.io.FileReader reader = new java.io.FileReader(fileName)) {
            int read=0;
            while((read = reader.read()) != -1){
                System.out.print((char) read);
            }
        }catch(FileNotFoundException exception){
            System.out.printf("%s not found" , fileName);
        }
        catch ( IOException exception) {
            System.out.printf("Exception occurred: %s" ,
                    exception.getMessage());
        }
    }
}

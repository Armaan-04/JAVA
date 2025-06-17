package Codes.Intermediate.OOPS.Library;

public class Magazine extends LibraryItem{

    private String IssueNumber;

    public Magazine (String IssueNumber){
        this.IssueNumber=IssueNumber;
    }

    public void issueno(){
        System.out.println("The issue number is: " + IssueNumber);
    }
}

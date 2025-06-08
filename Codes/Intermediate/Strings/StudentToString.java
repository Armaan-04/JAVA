package Codes.Intermediate;

public class StudentToString {
    String name;
    int age;
    String rollNo;
    String house;

    public StudentToString(String name , int age , String rollNo , String house){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    public String toString(){
        return "Student Details: { name:" + name
                + " , age: " + age
                + " , roll number: " + rollNo
                + " , house: " + house + " } ";
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Armaan" , 21 , "001" , "red");
        System.out.println(stu);
    }
}


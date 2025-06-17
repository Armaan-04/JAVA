package Codes.Intermediate.OOPS.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Armaan" , 21 , 25000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName(" June ");
        System.out.println(emp.getEmployeeDetails());
    }
}

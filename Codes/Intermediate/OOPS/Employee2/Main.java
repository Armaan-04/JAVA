package Codes.Intermediate.OOPS.Employee2;

public class Main {
    public static void main(String[] args) {
        Employee employees[] = new Employee[4];

        employees[0] = new Manager();
        employees[1] = new Developer();
        employees[2] = new Manager();
        employees[3] = new Developer();

        for (int i = 0 ; i < employees.length ; i++){
            employees[i].getDetails();
        }
    }
}

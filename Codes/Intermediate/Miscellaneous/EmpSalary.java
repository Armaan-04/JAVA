package Codes.Intermediate.Miscellaneous;

import java.util.Scanner;

public class EmpSalary {
    double basic;

    EmpSalary(double basic) {
        this.basic = basic;
    }

    void generateSalarySlip() {
        System.out.println("Employee salary slip.");
    }
}


   class Technical extends EmpSalary {
        Technical( double basic) {
            super( basic);
        }


        void generateSalarySlip() {
            double da = 0.4 * basic;
            double hra = 0.15 * basic;
            double earnings = da + basic + hra;

            double deductions = 0.12 * basic;
            double bonus = 0.2 * basic;
            double netSalary = earnings + bonus - deductions;
            System.out.println("Net Salary is Rs " + netSalary);
        }
    }

    class nonTechnical extends EmpSalary {
        nonTechnical( double basic) {
            super( basic);
        }


        void generateSalarySlip() {
            double da = 0.4 * basic;
            double hra = 0.15 * basic;
            double earnings = da + basic + hra;

            double deductions = 0.12 * basic;
            double bonus = 0.2 * basic;
            double netSalary = earnings + bonus - deductions;
            System.out.println("Net Salary is Rs " + netSalary);
        }
    }

     class TestEmployee{
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter basic salary: ");
            double basic = sc.nextDouble();

            System.out.println("Enter 1 for tech , 2 for nonTech.");
            int type = sc.nextInt();

            EmpSalary emp;
            if(type ==1){
                emp = new Technical(basic);
            }else if (type == 2){
                emp = new nonTechnical(basic);
            }else{
                System.out.println("Invalid employee.");
                return;
            }
            emp.generateSalarySlip();
        }
    }



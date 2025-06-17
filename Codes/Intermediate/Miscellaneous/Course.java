package Codes.Intermediate.Miscellaneous;

public class Course {
    String courseName;
    int enrollments;
    static int maxCapacity = 100;

    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }



    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;//when name is conflicting and it is a static variable..use class name to access.
    }
        void enrollStudent(String studentName){
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        }

        void unEnrollStudent(String studentName){
            System.out.println("Student removed.");
            enrollments--;
        }
}

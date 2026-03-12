/*CT100/G/22434/24
KIBET NIMROD 
GROUP A */
import java.util.Scanner;

// Class to store student details
class StudentRecord {
    private String studentID;
    private String name;
    private String course;

    // Constructor to initialize student fields
    public StudentRecord(String studentID, String name, String course) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Student Details:");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

// Class to demonstrate student record functionality
class StudentApp {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student details
        System.out.println("Enter student details:");
        System.out.print("Student ID: ");
        String studentID = scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Course: ");
        String course = scanner.nextLine();

        // Instantiate a StudentRecord object with user-provided data
        StudentRecord student = new StudentRecord(studentID, name, course);

        // Display the student's details
        System.out.println();
        student.displayInfo();

        // Close the scanner
        scanner.close();
    }
}

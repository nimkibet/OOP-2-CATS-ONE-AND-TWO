/*CT100/G/22434/24
KIBET NIMROD 
GROUP A */
import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    // Constructor to initialize vehicle fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car that extends Vehicle
class Car extends Vehicle {
    private String fuelType;

    // Constructor to initialize all fields including parent class fields
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    // Override displayDetails to also print fuelType
    @Override
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Showroom class to demonstrate the functionality
class Showroom {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for car details
        System.out.println("Enter car details:");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Fuel Type: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object with user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Display the car's details
        System.out.println();
        car.displayDetails();

        // Close the scanner
        scanner.close();
    }
}

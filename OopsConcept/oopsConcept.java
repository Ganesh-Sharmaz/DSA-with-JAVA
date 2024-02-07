class Car {
    // Attributes or instance variables
    String brand;
    String model;
    int year;

    // Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class oopsConcept {

    public static void main(String[] args) {
        // Create an object of Car class
        Car myCar = new Car("Mahato", "Aniket", 2002);
        
        // Accessing object properties and methods
        myCar.displayInfo();
    }
    
}

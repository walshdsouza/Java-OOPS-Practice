import java.util.Scanner;

class Laptop {
    // Private attributes
    private String brand;
    private int ramSize;
    private double price;

    // Constructor
    public Laptop(String brand, int ramSize, double price) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    // Getter for RAM size
    public int getRamSize() {
        return ramSize;
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Brand: " + brand + " | RAM: " + ramSize + "GB | Price: $" + price);
    }
}

public class LaptopStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many laptops do you want to add to the store? ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        // Create an array of Laptop objects
        Laptop[] laptops = new Laptop[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Laptop " + (i + 1) + " ---");
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            
            System.out.print("RAM size (in GB): ");
            int ram = scanner.nextInt();
            
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the leftover newline

            // Instantiate and store in array
            laptops[i] = new Laptop(brand, ram, price);
        }

        System.out.println("\n==========================================");
        System.out.println(" Laptops with RAM greater than 8 GB:");
        System.out.println("==========================================");

        boolean found = false;
        for (Laptop laptop : laptops) {
            if (laptop.getRamSize() > 8) {
                laptop.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No laptops found with more than 8GB of RAM.");
        }
        
        scanner.close();
    }
}

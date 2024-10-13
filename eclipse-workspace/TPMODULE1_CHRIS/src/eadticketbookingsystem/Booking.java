package eadticketbookingsystem;
import java.util.ArrayList;
import java.util.Scanner;

public class Booking {
    private ArrayList<Flight> flightList;
    private ArrayList<Passenger> passengerList;
    private Scanner scanner;

    public Booking() {
        flightList = new ArrayList<>();
        passengerList = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeFlightList();
    }

    private void initializeFlightList() {
        // Add some sample flights
        flightList.add(new Flight("GA101", "CGK, Jakarta", "DPS, Bali", "08:30", "11:15", 1200000.0f));
        flightList.add(new Flight("QZ202", "SUB, Surabaya", "MED, Medan", "09:00", "11:45", 1500000.0f));
    }

    public void displayMenu() {
        System.out.println("===== EAD Ticket Booking System =====");
        System.out.println("1. Display Flight List");
        System.out.println("2. Book Ticket");
        System.out.println("3. Display Booking");
        System.out.println("4. Exit");
        System.out.print("Please select a menu: ");
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    displayFlightList();
                    break;
                case 2:
                    bookTicket();
                    break;
                case 3:
                    displayBooking();
                    break;
                case 4:
                    System.out.println("Thank you for using EAD Ticket Booking System!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void displayFlightList() {
        for (int i = 0; i < flightList.size(); i++) {
            System.out.println("Index: " + i);
            flightList.get(i).displayFlightList();
            System.out.println();
        }
    }

    private void bookTicket() {
        System.out.println("=== Ticket Booking ===");
        
        // Display available flights
        displayFlightList();
        
        // Select flight
        System.out.print("Enter the index of the flight you want to book: ");
        int flightIndex = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (flightIndex < 0 || flightIndex >= flightList.size()) {
            System.out.println("Invalid flight index. Booking cancelled.");
            return;
        }
        
        // Enter passenger details
        System.out.print("Enter your Student ID (NIM): ");
        String id = scanner.nextLine();
        
        System.out.print("Enter your First Name (short name): ");
        String firstName = scanner.nextLine();
        
        System.out.print("Enter your Last Name : ");
        String lastName = scanner.nextLine();
        
        // Create passenger and add to list
        Passenger passenger = new Passenger(id, firstName, lastName);
        passengerList.add(passenger);
        
        System.out.println("Ticket booked successfully!");
    }

    private void displayBooking() {
        if (passengerList.isEmpty()) {
            System.out.println("No bookings have been made yet.");
            return;
        }
        
        System.out.println("=== Current Bookings ===");
        for (int i = 0; i < passengerList.size(); i++) {
            System.out.println("Booking " + (i + 1) + ":");
            passengerList.get(i).displayPassengerList();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Booking system = new Booking();
        system.run();
    }
}

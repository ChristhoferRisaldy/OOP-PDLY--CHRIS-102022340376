package eadticketbookingsystem;

public class Passenger {
    private String id;
    private String firstName;
    private String lastName;

    // Constructor
    public Passenger(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter methods
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    // Method to display passenger details
    public void displayPassengerList() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + firstName + " " + lastName);
    }
}
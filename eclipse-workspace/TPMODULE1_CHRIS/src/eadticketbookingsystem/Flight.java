package eadticketbookingsystem;
public class Flight {
    private String flightNumber;
    private String departureAirport;
    private String arrivalAirport;
    private String departureTime;
    private String arrivalTime;
    private float ticketPrice;

    // Constructor
    public Flight(String flightNumber, String departureAirport, String arrivalAirport,
                  String departureTime, String arrivalTime, float ticketPrice) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
    }

    // Getter methods
    public String getFlightNumber() { return flightNumber; }
    public String getDepartureAirport() { return departureAirport; }
    public String getArrivalAirport() { return arrivalAirport; }
    public String getDepartureTime() { return departureTime; }
    public String getArrivalTime() { return arrivalTime; }
    public float getTicketPrice() { return ticketPrice; }

    // Method to display flight details
    public void displayFlightList() {
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Departure Airport: " + departureAirport);
        System.out.println("Arrival Airport: " + arrivalAirport);
        System.out.println("Departure Time: " + departureTime);
        System.out.println("Arrival Time: " + arrivalTime);
        System.out.println("Ticket Price: Rp" + ticketPrice);
    }
}
class CinemaBooking {
    String customerName;
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    CinemaBooking(String customerName, String movieName,
                  double ticketPrice, int numberOfTickets) {
        this.customerName = customerName;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    CinemaBooking(String customerName, String movieName,
                  int numberOfTickets) {
        this.customerName = customerName;
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = 200;
    }

    void bookTickets() {
        displayBooking();
    }

    void bookTickets(int tickets) {
        numberOfTickets = tickets;
        displayBooking();
    }

    void displayBooking() {
        System.out.println("\nCustomer Name   : " + customerName.toUpperCase());
        System.out.println("Movie Name      : " + movieName.toUpperCase());

        if (ticketPrice > 0) {
            System.out.printf("Ticket Price    : Rs. %.2f%n", ticketPrice);
        }

        System.out.println("Number of Tickets: " + numberOfTickets);

        if (numberOfTickets <= 0) {
            System.out.println("Booking Status  : Booking Failed");
            return;
        }

        double totalAmount = ticketPrice * numberOfTickets;
        double discount = numberOfTickets >= 5 ? totalAmount * 0.10 : 0;
        double finalAmount = totalAmount - discount;

        System.out.println("Booking Status  : Booking Successful");
        System.out.printf("Total Amount    : Rs. %.2f%n", totalAmount);
        System.out.printf("Discount        : Rs. %.2f%n", discount);
        System.out.printf("Final Amount    : Rs. %.2f%n", finalAmount);
    }

    static void compareCustomers(String name1, String name2) {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Both customers have the same name.");
        } else {
            System.out.println("Customers have different names.");
        }
    }

    public static void main(String[] args) {
        System.out.println("========== CINEMA TICKET BOOKING ==========");

        CinemaBooking b1 =
            new CinemaBooking("Sneha", "Avatar", 200, 5);
        b1.bookTickets();

        CinemaBooking b2 =
            new CinemaBooking("Arjun", "Avatar", 2);
        b2.bookTickets();

        compareCustomers(b1.customerName, b2.customerName);
    }
}
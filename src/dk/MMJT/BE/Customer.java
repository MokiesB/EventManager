package dk.MMJT.BE;

import java.util.ArrayList;

public class Customer extends User{
    ArrayList<Event> availableEvents = new ArrayList<>();
    ArrayList<Ticket> allTickets = new ArrayList<>();
    public Customer(int id, String username,  String email) {
        super(id, username, email);
    }
}

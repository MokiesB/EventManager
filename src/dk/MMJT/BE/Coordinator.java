package dk.MMJT.BE;

import java.util.ArrayList;

public class Coordinator extends User {
    ArrayList<User> allUsers = new ArrayList<>();
    ArrayList<Event> allEvents = new ArrayList<>();

    public Coordinator(int id, String username, String email) {
        super(id, username, email);
    }
}

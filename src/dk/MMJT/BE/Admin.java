package dk.MMJT.BE;

import java.util.ArrayList;

public class Admin extends User{
    ArrayList<User> allUsers = new ArrayList<>();
    ArrayList<Event> allEvents = new ArrayList<>();
    public Admin(int id, String username, String email) {
        super(id, username, email);
    }
}

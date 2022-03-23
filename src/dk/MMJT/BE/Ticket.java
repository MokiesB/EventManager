package dk.MMJT.BE;

public class Ticket {
    private String Name;
    private int id;
    private int eventID;
    private int price;

    public Ticket(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        Name = name;
    }
}

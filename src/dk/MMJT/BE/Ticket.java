package dk.MMJT.BE;

public class Ticket {
    private String Name;

    public Ticket(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

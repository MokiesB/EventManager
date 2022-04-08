package dk.MMJT.BE;

import java.util.ArrayList;

public class Event {

    private String eventName;
    private String startDate;
    private String eventLocation;
    ArrayList<Ticket> allCustomers = new ArrayList<>();

    public Event(String eventName, String eventLocation, String startDate) {
        this.eventName = eventName;
        this.startDate = startDate;
        this.eventLocation = eventLocation;
    }




    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

}

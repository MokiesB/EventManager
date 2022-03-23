package dk.MMJT.BE;

import java.util.ArrayList;
import java.util.Date;

public class Event {
    private final int eventID;
    private String eventName;
    private Date startDate;
    private String eventLocation;
    ArrayList<Ticket> allCustomers = new ArrayList<>();

    public Event(int eventID, String eventName, String eventLocation, Date startDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.startDate = startDate;
        this.eventLocation = eventLocation;
    }


    public int getEventID() {
        return eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

}

package dk.MMJT.BE;

import java.util.Date;

public class Event {
    private final int eventID;
    private String eventName;
    private Date startDate;
    private String eventLocation;

    public Event(int eventID, String eventname, String location, Date date) {
        this.eventID = eventID;
        eventName = eventname;
        startDate = date;
        eventLocation = location;
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

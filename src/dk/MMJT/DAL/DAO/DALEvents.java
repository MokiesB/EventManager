package dk.MMJT.DAL.DAO;

import dk.MMJT.BE.Event;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DALEvents {


    public static ObservableList<Event> getEvent() {

        ObservableList<Event> events = FXCollections.observableArrayList();

        events.add(new Event("Smukfest", "Skanderborg", "04/07/2022"));
        events.add(new Event("TinderBox", "Odense", "23/06/2022"));

        return events;

    }
}

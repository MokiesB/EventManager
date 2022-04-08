package dk.MMJT.GUI.Controllers;

import dk.MMJT.BE.Event;
import dk.MMJT.DAL.DAO.DALEvents;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class EventsController implements Initializable {


    @FXML
    private TableView<Event> EventTableView;

    @FXML
    private TableColumn<Event, String> EventName;

    @FXML
    private TableColumn<Event, String> EventDate;


    @FXML
    private void populateTableview (){

        EventName.setCellValueFactory((new PropertyValueFactory<Event,String>("Name")));
        EventDate.setCellValueFactory((new PropertyValueFactory<Event,String>("Date")));

        System.out.println(DALEvents.getEvent());
        EventTableView.setItems(DALEvents.getEvent());
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        populateTableview();

    }
}

package dk.MMJT.GUI.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuController implements Initializable {

    public void OpenEvents(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("dk/MMJT/GUI/View/Events.Fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void OpenTickets(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("dk/MMJT/GUI/View/Tickets.Fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    public void OpenUser(ActionEvent actionEvent) throws IOException {
        Parent part = FXMLLoader.load(getClass().getResource("dk/MMJT/GUI/View/User.Fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}

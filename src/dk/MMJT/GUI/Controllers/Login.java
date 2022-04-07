package dk.MMJT.GUI.Controllers;

import dk.MMJT.GUI.Models.AdminModel;
import dk.MMJT.GUI.Models.EventModel;
import dk.MMJT.GUI.Models.TicketModel;
import dk.MMJT.GUI.Models.UserModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    private AdminModel adminModel = AdminModel.getInstance();
    private UserModel userModel = UserModel.getInstance();
    private EventModel eventModel = EventModel.getInstance();
    private TicketModel ticketModel = TicketModel.getInstance();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void OpenMainMenu(ActionEvent event) {

        Parent root;

        try{
            root = FXMLLoader.load(getClass().getResource("dk/MMJT/GUI/View/MainMenu.Fxml"));
            Stage stage = new Stage();
            stage.setTitle("Main Menu");
            stage.setScene(new Scene(root));
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();


        }
        catch(IOException e){
            e.printStackTrace();

        }

    }
}

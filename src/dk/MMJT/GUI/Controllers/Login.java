package dk.MMJT.GUI.Controllers;

import dk.MMJT.GUI.Models.AdminModel;
import dk.MMJT.GUI.Models.EventModel;
import dk.MMJT.GUI.Models.TicketModel;
import dk.MMJT.GUI.Models.UserModel;

public class Login {
    private AdminModel adminModel = AdminModel.getInstance();
    private UserModel userModel = UserModel.getInstance();
    private EventModel eventModel = EventModel.getInstance();
    private TicketModel ticketModel = TicketModel.getInstance();

    public Login() {
        userModel.loginUser("Test", "Test");
    }
}

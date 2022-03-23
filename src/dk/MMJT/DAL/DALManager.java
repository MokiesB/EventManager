package dk.MMJT.DAL;

import dk.MMJT.BE.User;
import dk.MMJT.DAL.DAO.AdminDAO;
import dk.MMJT.DAL.DAO.EventDAO;
import dk.MMJT.DAL.DAO.TicketDAO;
import dk.MMJT.DAL.DAO.UserDAO;

public class DALManager implements IDALManager {
    private UserDAO userDAO;
    private AdminDAO adminDAO;
    private TicketDAO ticketDAO;
    private EventDAO eventDAO;

    public DALManager() {
        this.adminDAO = new AdminDAO();
        this.ticketDAO = new TicketDAO();
        this.eventDAO = new EventDAO();
        this.userDAO = new UserDAO();
    }

    @Override
    public User loginUser(String username, String password) {
        return userDAO.loginUser(username, password);
    }


}

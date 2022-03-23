package dk.MMJT.BLL;

import dk.MMJT.BE.User;
import dk.MMJT.DAL.DALManager;
import dk.MMJT.DAL.IDALManager;

public class BLLManager implements IBLLManager {
    private IDALManager dalManager;

    public BLLManager() {
        this.dalManager = new DALManager();
    }

    @Override
    public User loginUser(String username, String password) {
        return dalManager.loginUser(username, password);
    }

}

package dk.MMJT.GUI.Models;

import dk.MMJT.BE.User;
import dk.MMJT.BLL.BLLManager;
import dk.MMJT.BLL.IBLLManager;

public class UserModel {

    private static UserModel single_instance = null;
    // Static method
    // Static method to create instance oc UserModel class
    public static UserModel getInstance()
    {
        if (single_instance == null)
            single_instance = new UserModel();

        return single_instance;
    }

    private IBLLManager bllManager;

    public UserModel() {
        this.bllManager = new BLLManager();
    }

    public User loginUser(String username, String password){
        return bllManager.loginUser(username, password);
    }
}

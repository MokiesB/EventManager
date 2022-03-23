package dk.MMJT.GUI.Models;

import dk.MMJT.BLL.BLLManager;
import dk.MMJT.BLL.IBLLManager;

public class AdminModel {
    private static AdminModel single_instance = null;
    // Static method
    // Static method to create instance oc AdminModel class
    public static AdminModel getInstance()
    {
        if (single_instance == null)
            single_instance = new AdminModel();

        return single_instance;
    }

    private IBLLManager bllManager;

    public AdminModel() {
        this.bllManager = new BLLManager();
    }
}

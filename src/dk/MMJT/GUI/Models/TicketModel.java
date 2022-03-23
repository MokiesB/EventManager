package dk.MMJT.GUI.Models;

import dk.MMJT.BLL.BLLManager;
import dk.MMJT.BLL.IBLLManager;

public class TicketModel {
    private static TicketModel single_instance = null;
    // Static method
    // Static method to create instance oc TicketModel class
    public static TicketModel getInstance()
    {
        if (single_instance == null)
            single_instance = new TicketModel();

        return single_instance;
    }

    private IBLLManager bllManager;

    public TicketModel() {
        this.bllManager = new BLLManager();
    }
}

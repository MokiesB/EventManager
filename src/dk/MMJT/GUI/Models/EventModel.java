package dk.MMJT.GUI.Models;

import dk.MMJT.BLL.BLLManager;
import dk.MMJT.BLL.IBLLManager;

public class EventModel {
    private static EventModel single_instance = null;
    // Static method
    // Static method to create instance oc EventModel class
    public static EventModel getInstance()
    {
        if (single_instance == null)
            single_instance = new EventModel();

        return single_instance;
    }

    private IBLLManager bllManager;

    public EventModel() {
        this.bllManager = new BLLManager();
    }
}

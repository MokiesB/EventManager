package dk.MMJT.BLL;

import dk.MMJT.BE.User;
import dk.MMJT.DAL.DALManager;
import dk.MMJT.DAL.IDALManager;

import java.io.IOException;

public class BLLManager implements IBLLManager {
    private IDALManager dalManager;
    private QRHelper qrHelper;

    public BLLManager() throws Exception {
        this.dalManager = new DALManager();
        this.qrHelper = new QRHelper();
    }

    @Override
    public User loginUser(String username, String password) {
        return dalManager.loginUser(username, password);
    }
         {
            qrHelper.generateQRCodeImage("coolEvent");
        }
}

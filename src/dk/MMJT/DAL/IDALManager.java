package dk.MMJT.DAL;

import dk.MMJT.BE.User;

public interface IDALManager {
    User loginUser(String username, String password);
}

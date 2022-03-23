package dk.MMJT.BLL;

import dk.MMJT.BE.User;

public interface IBLLManager {

    User loginUser(String username, String password);
}

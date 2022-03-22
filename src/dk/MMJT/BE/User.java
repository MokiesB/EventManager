package dk.MMJT.BE;

public class User {
    private final int ID;
    private String Username;
    private String Password;
    private String Email;
    public User(int id, String username, String password, String email) {
        this.ID = id;
        Username = username;
        Password = password;
        Email = email;
    }

    public int getID() {
        return ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

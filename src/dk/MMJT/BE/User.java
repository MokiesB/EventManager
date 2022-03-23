package dk.MMJT.BE;

public class User {
    private final int ID;
    private String Username;
    private String Email;
    public User(int id, String username, String email) {
        this.ID = id;
        Username = username;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}

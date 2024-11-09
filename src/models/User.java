
package models;

public class User {
    // Attributes
    private int id;
    private String dni;
    private String fullname;
    private String username;
    private String password;
    
    // Constructors
    public User() {
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

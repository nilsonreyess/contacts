
package models;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel extends ConnectDB{
    
    public boolean validateUser(User u) {
        String querySQL = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try {
            PreparedStatement ps = getConnection().prepareStatement(querySQL);
            ps.setString(1, u.getUsername());
            ps.setString(2, u.getPassword());
            ResultSet rs = ps.executeQuery();

            return rs.next();
            
        } catch (SQLException e) {
            return false;
            
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoTrack;
import java.util.HashMap;
/**
 *
 * @author msi410
 */
public class AuthManager {
     private final HashMap<String, String> userDatabase;

    public AuthManager() {
        // Example: Hardcoded user credentials
        userDatabase = new HashMap<>();
        userDatabase.put("admin", "password123");
        userDatabase.put("user", "pass");
        
    }

    public boolean validateUser(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}

    


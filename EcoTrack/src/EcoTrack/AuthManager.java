package EcoTrack;

import java.util.HashMap;

public class AuthManager {
    private final HashMap<String, String> userDatabase;

    public AuthManager() {
        // Initialize a HashMap to store user data. In real applications, use a database.
        userDatabase = new HashMap<>();
        // Example hardcoded user for testing purposes
        userDatabase.put("admin", "password123");
         userDatabase.put("michael", "michael123");
          userDatabase.put("abdallah", "abdallah123");
           userDatabase.put("glen", "glen123");
    }

    /**
     * Validates a user login attempt.
     * @param username The username entered by the user.
     * @param password The password entered by the user.
     * @return True if the username and password match; false otherwise.
     */
    public boolean validateUser(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

    /**
     * Registers a new user if the username doesn't already exist.
     * @param username The new username.
     * @param password The new user's password.
     * @return True if registration is successful, false if the username already exists.
     */
    public boolean registerUser(String username, String password) {
        if (userDatabase.containsKey(username)) {
            // Username already exists
            return false;
        }
        // Add the new user to the database
        userDatabase.put(username, password);
        return true;
    }
}
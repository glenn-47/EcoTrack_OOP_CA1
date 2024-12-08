package EcoTrack;

import java.util.HashMap;

public class AuthManager {
    private final HashMap<String, User> userDatabase;

    public AuthManager() {
        userDatabase = new HashMap<>();
    }

    public boolean registerUser(String username, String password, String email, String dateOfBirth) {
        if (userDatabase.containsKey(username)) {
            return false;
        }

        // Create new user with the provided details
        userDatabase.put(username, new User(username, password, email, dateOfBirth));
        return true;
    }

    public User getUser(String username) {
        return userDatabase.get(username); // Fetch the user details by username
    }

    public boolean validateUser(String username, String password) {
        User user = userDatabase.get(username);
        return user != null && user.getPassword().equals(password);
    }
}
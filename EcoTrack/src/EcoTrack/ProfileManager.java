/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoTrack;

/**
 *
 * @author abdallah haoui
 */
public class ProfileManager {
    private UserProfile userProfile;

    public ProfileManager(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void updateUserProfile(String username, String email, String dateOfBirth) {
        userProfile.setUsername(username);
        userProfile.setEmail(email);
        userProfile.setDateOfBirth(dateOfBirth);
    }
}

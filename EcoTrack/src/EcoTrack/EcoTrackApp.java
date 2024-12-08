/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EcoTrack;

/**
 *
 * @author fsheridan
 */
public class EcoTrackApp {
     public static void main(String[] args) {
        AuthManager authManager = new AuthManager(); // Shared AuthManager instance
        new loginGUI(authManager).setVisible(true);
    }
    
}

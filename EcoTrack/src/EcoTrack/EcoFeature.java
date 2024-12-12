/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoTrack;

/**
 *
 * @author michael
 */
public abstract class EcoFeature {
    private String featureName;

    // Constructor
    public EcoFeature(String featureName) {
        this.featureName = featureName;
    }

    // Getter for feature name
    public String getFeatureName() {
        return featureName;
    }

    // Setter for feature name
    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    // Abstract method for displaying feature details
    public abstract String displayFeatureDetails();
}

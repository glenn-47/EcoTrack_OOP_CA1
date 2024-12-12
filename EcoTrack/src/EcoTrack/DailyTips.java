/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EcoTrack;

/**
 *
 * @author michael
 */
import java.util.Random;
import EcoTrack.EcoFeature;


public class DailyTips extends EcoFeature {
    private String[] tips;
    private String currentTip;

    public DailyTips() {
        super("Daily Sustainability Tips");
        this.tips = new String[]{
            "Turn off lights when not in use.",
            "Use reusable bags instead of plastic.",
            "Compost your organic waste.",
            "Conserve water by fixing leaks.",
            "Opt for public transport whenever possible."
        };
        this.currentTip = generateRandomTip();
    }

    public String generateRandomTip() {
        Random random = new Random();
        return tips[random.nextInt(tips.length)];
    }

    public void updateTip() {
        this.currentTip = generateRandomTip();
    }

    public String getCurrentTip() {
        return currentTip;
    }

    @Override
    public String displayFeatureDetails() {
        return "Feature: " + getFeatureName() + "\nToday's Tip: " + currentTip;
    }
}

package io.cucumber.skeleton;

public class Belly {
    private int cukes;

    public void eat(int cukes) {
        this.cukes = cukes;
    }

    public boolean isGrowling() {
        // Implement logic to check if the belly is growling
        // You can define the conditions that determine if the belly should growl
        // For example, you can check if the number of cukes is greater than a certain threshold
        return cukes > 10; // Adjust the threshold as needed
    }
}
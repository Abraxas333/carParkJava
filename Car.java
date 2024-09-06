

public class Car extends Vehicle {
    public int numberOfDoors;
    public boolean hasAirConditioning;
    public boolean isElectric;

    public Car(String type, String brand, double tank, int mileage, int id, int numberOfDoors, boolean hasAirConditioning, boolean isElectric) {
        super(type, brand, tank, mileage, id);
        this.numberOfDoors = numberOfDoors;
        this.hasAirConditioning = hasAirConditioning;
        this.isElectric = isElectric;
    }

    public double calculateRange() {
        if (isElectric) {
            // Example: use a formula for electric range calculation
            return tank * 5; // Assuming 5 km per unit of tank for electric
        } else {
            return tank * mileage / 10; // A simple formula for fuel range
        }
    }

    public void toggleAirConditioning() {
        hasAirConditioning = !hasAirConditioning;
    }

    public int getNumberOfDoors() {return numberOfDoors;}

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    public boolean getHasAirConditioning() {return hasAirConditioning;}

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean getIsElectric() { return isElectric;}

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }
}

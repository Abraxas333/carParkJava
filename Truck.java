public class Truck extends Vehicle {
    private double maxLoadCapacity;
    private int numberOfAxles;
    private double currentLoad;

    public Truck(String type, String brand, double tank, int mileage, int id, double maxLoadCapacity, int numberOfAxles) {
        super(type, brand, tank, mileage, id);
        this.maxLoadCapacity = maxLoadCapacity;
        this.numberOfAxles = numberOfAxles;
        this.currentLoad = 0;
    }

    public void loadCargo(double weight) {
        if (currentLoad + weight <= maxLoadCapacity) {
            currentLoad += weight;
            System.out.println("Loaded " + weight + " tons of cargo. Current load: " + currentLoad + " tons.");
        } else {
            System.out.println("Cannot load. Exceeds max capacity of " + maxLoadCapacity + " tons.");
        }
    }

    public double calculateFuelConsumption() {
        // Example: Assume more weight increases fuel consumption
        return (currentLoad / maxLoadCapacity) * 15 + (tank / mileage);
    }

    public double getMaxLoadCapacity() { return maxLoadCapacity; }

    public void setMaxLoadCapacity(double maxLoadCapacity) {
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public int getNumberOfAxles() { return numberOfAxles; }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public double getCurrentLoad() { return currentLoad; }

    public void setCurrentLoad(double currentLoad) {
        this.currentLoad = currentLoad;
    }
}

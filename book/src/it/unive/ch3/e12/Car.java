package it.unive.ch3.e12;

public class Car {
    private double fuelConsumption;
    private double tankCapacity;
    private double currentGas;

    public Car(double fuelConsumption, double tankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.currentGas = 0;
    }

    /**
     * @return the fuelConsumption
     */
    public double getFuelConsumption() {
        return this.fuelConsumption;
    }

    /**
     * @return the tankCapacity
     */
    public double getTankCapacity() {
        return this.tankCapacity;
    }

    /**
     * @return the currentGas
     */
    public double getCurrentGas() {
        return this.currentGas;
    }

    public void addGas(double moreFuel) {
        if (this.currentGas + moreFuel > this.tankCapacity) {
            throw new RuntimeException("Too much fuel: currentGas + moreFuel > tankCapacity");
        }

        if (moreFuel < 0) {
            throw new RuntimeException("moreFuel can't be negative");
        }

        this.currentGas += moreFuel;
    }

    public void drive(double kmToDo) {
        if (kmToDo < 0) {
            throw new IllegalArgumentException("kmToDo can't be negative");
        }

        if (kmToDo / this.fuelConsumption > currentGas) {
            throw new RuntimeException("Not enough gas");
        }

        this.currentGas -= kmToDo / this.fuelConsumption;
    }
}

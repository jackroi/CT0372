package it.unive.ch3.e12;

public class CarTester {
    public static void main(String[] args) {
        Car c = new Car(20, 60);

        c.addGas(30);
        c.drive(80);

        System.out.println(c.getCurrentGas());
    }
}

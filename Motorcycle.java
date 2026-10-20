/**

 * Project: Solo Lab1.5 Java Programming Assignment: Motorcycle
 * Purpose Details: Simulate a motorcycle using java class structures
 * Course: CMPSC 221, Section 002: OOP with Web
 * Author: Allen Chea
 * Date Developed: 10/19/26
 * Last Date Changed: 10/19/26
 * Revision: 1

 */


public class Motorcycle extends Vehicle {
    public Motorcycle(String color, double size, double maxGas, double topSpeed, double wheelRadius, double wheelWidth, Material frameMaterial, double horsePower, double brightness, double mirrorWidth, double mirrorHeight) {
        this.setColor(color);
        this.setSize(size);
        this.setMaxGas(maxGas);
        this.setTopSpeed(topSpeed);
        Wheel[] wheels = {new Wheel(wheelRadius, wheelWidth), new Wheel(wheelRadius, wheelWidth)};
        setWheels(wheels);
        this.setFrame(new Frame(frameMaterial));
        this.setEngine(new Engine(horsePower));
        Light[] lights = {new Light(brightness), new Light(brightness)};
        this.setLights(lights);
        Mirror[] mirrors = {new Mirror(mirrorWidth, mirrorHeight), new Mirror(mirrorWidth, mirrorHeight)};
        this.setMirrors(mirrors);
        this.setTurnSignal(new TurnSignal());
    }

    @Override public void drive(double speed) {
        if (this.getGas() == 0) {
            System.out.println("Motorcycle has no gas to start up.");
        }
        else {
            this.setSpeed(speed);
            System.out.println("Motorcycle driving at " + this.getSpeed() + " miles per hour ");
        }
    }
    @Override public void stop() {
        System.out.println("Stopped motorcycle.");
    }
    public void refuel() {
        this.setGas(this.getMaxGas());
    }
    public double[] getWheelSize() {
        return new double[]{this.getWheels()[0].getRadius(), this.getWheels()[0].getWidth()};
    }
}

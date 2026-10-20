/**

 * Project: Solo Lab1.5 Java Programming Assignment: Motorcycle
 * Purpose Details: Simulate a motorcycle using java class structures
 * Course: CMPSC 221, Section 002: OOP with Web
 * Author: Allen Chea
 * Date Developed: 10/19/26
 * Last Date Changed: 10/19/26
 * Revision: 1

 */

public class Vehicle {
    private String color;
    private double size;
    private double gas;
    private double maxGas;
    private double speed;
    private double topSpeed;
    private Wheel[] wheels;
    private Light[] lights;
    private Mirror[] mirrors;
    private Frame frame;
    private Engine engine;
    private TurnSignal turnSignal;

    public void drive(double speed) {
        this.speed = speed;
        System.out.println("Started Vehicle");
    }
    public void stop() {
        this.speed = 0;
        System.out.println("Stopped Vehicle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = Math.max(0, Math.min(this.maxGas, gas));
    }

    public double getMaxGas() {
        return maxGas;
    }

    public void setMaxGas(double maxGas) {
        this.maxGas = maxGas;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = Math.min(this.topSpeed, speed);
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Light[] getLights() {
        return lights;
    }

    public void setLights(Light[] lights) {
        this.lights = lights;
    }

    public Mirror[] getMirrors() {
        return this.mirrors;
    }

    public void setMirrors(Mirror[] mirrors) {
        this.mirrors = mirrors;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public TurnSignal getTurnSignal() {
        return turnSignal;
    }

    public void setTurnSignal(TurnSignal turnSignal) {
        this.turnSignal = turnSignal;
    }

    // Extra wrappers for objects under a vehicle instance
    public void toggleLights() {
        for (Light i: this.lights) {
            i.setActive();
        }
    }
    public boolean checkLights() {
        return this.lights[0].getActive();
    }
    public void setBrightness(double brightness) {
        for (Light i: this.lights) {
            i.setBrightness(brightness);
        }
    }
    public double getBrightness() {
        return this.lights[0].getBrightness();
    }
    public void setSignaledTurn(String turn) {
        this.turnSignal.setSignaledTurn(turn);
    }
    public String getSignaledTurn() {
        return this.turnSignal.getSignaledTurn();
    }
    public void setMirrorSize(double width, double height) {
        for (Mirror i: this.mirrors) {
            i.setHeight(height);
            i.setWidth(width);
        }
    }
    public double[] getMirrorSize() {
        return new double[]{this.mirrors[0].getWidth(), this.mirrors[0].getHeight()};
    }
    public void setHorsepower(double horsepower) {
        this.engine.setHorsepower(horsepower);
    }
    public double getHorsepower() {
        return this.engine.getHorsepower();
    }
    public void setMaterial(Material material) {
        this.frame.setMaterial(material);
    }
    public Material getMaterial() {
        return this.frame.getMaterial();
    }
}
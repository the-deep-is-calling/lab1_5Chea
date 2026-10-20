/**

 * Project: Solo Lab1.5 Java Programming Assignment: Motorcycle
 * Purpose Details: Simulate a motorcycle using java class structures
 * Course: CMPSC 221, Section 002: OOP with Web
 * Author: Allen Chea
 * Date Developed: 10/19/26
 * Last Date Changed: 10/19/26
 * Revision: 1

 */

public class Wheel {
    private double radius;
    private double width;
    private Material material;
    public Wheel(double radius, double width) {
        this.radius = radius;
        this.width = width;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getWidth() {
        return this.width;
    }
}

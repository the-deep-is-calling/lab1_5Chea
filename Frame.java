/**

 * Project: Solo Lab1.5 Java Programming Assignment: Motorcycle
 * Purpose Details: Simulate a motorcycle using java class structures
 * Course: CMPSC 221, Section 002: OOP with Web
 * Author: Allen Chea
 * Date Developed: 10/19/26
 * Last Date Changed: 10/19/26
 * Revision: 1

 */


public class Frame {
    private Material material;
    public Frame(Material material) {
        this.material = material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public Material getMaterial() {
        return material;
    }
}

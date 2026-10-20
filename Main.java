/**

 * Project: Solo Lab1.5 Java Programming Assignment: Motorcycle
 * Purpose Details: Simulate a motorcycle using java class structures
 * Course: CMPSC 221, Section 002: OOP with Web
 * Author: Allen Chea
 * Date Developed: 10/19/26
 * Last Date Changed: 10/19/26
 * Revision: 1

 */
public static void printEverythingAboutTheMotorcycle(Motorcycle motorcycle) {
    System.out.println("Color: " + motorcycle.getColor());
    System.out.println("Size: " + motorcycle.getSize());
    System.out.println("Gas: " + motorcycle.getGas() + "/" + motorcycle.getMaxGas());
    System.out.println("Speed: " + motorcycle.getSpeed() + "/" + motorcycle.getTopSpeed());
    System.out.println("Wheels :" + Arrays.toString(motorcycle.getWheels()));
    System.out.println("Wheel Size (Height, Width): " + Arrays.toString(motorcycle.getWheelSize()));
    System.out.println("Lights :" + Arrays.toString(motorcycle.getLights()));
    System.out.println("Are lights on?: " + motorcycle.checkLights());
    System.out.println("Light Brightness: " + motorcycle.getBrightness());
    System.out.println("Mirrors: " + Arrays.toString(motorcycle.getMirrors()));
    System.out.println("Mirror Size: " + Arrays.toString(motorcycle.getMirrorSize()));
    System.out.println("Frame: " + motorcycle.getFrame());
    System.out.println("Frame Material: " + motorcycle.getMaterial());
    System.out.println("Engine: " + motorcycle.getEngine());
    System.out.println("Engine Horsepower: " + motorcycle.getHorsepower());
    System.out.println("Turn Signal: " + motorcycle.getTurnSignal());
    System.out.println("Signaled Turn: " + motorcycle.getSignaledTurn());
}

public static void main(String[] args) {
    Motorcycle motorcycle1 = new Motorcycle("Blue", 10.5, 8.0, 60, 5, 2, Material.METAL, 50, 1, 5, 3);
    printEverythingAboutTheMotorcycle(motorcycle1);
    System.out.println("");

    Motorcycle motorcycle2 = new Motorcycle("Orange", 8, 9.0, 75, 4, 1.5, Material.METAL, 33, 1, 6, 4);
    motorcycle2.setColor("Yellow");
    motorcycle2.setSignaledTurn("Left");
    motorcycle2.refuel();
    motorcycle2.drive(40);
    printEverythingAboutTheMotorcycle(motorcycle2);
    System.out.println("");

    Motorcycle motorcycle3 = new Motorcycle("Green", 9, 10.0, 80, 4.5, 1.75, Material.METAL, 1, 1, 4, 2);
    motorcycle3.drive(80);
    printEverythingAboutTheMotorcycle(motorcycle3);
    System.out.println("");

}

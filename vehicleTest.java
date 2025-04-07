/* Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive()
 * method to print "Repairing a car".
 */

 class Vehicle {
    public void drive(){
        System.out.println("The car is moving");
    }
}

class Car extends Vehicle {
    @Override
    public void drive(){
        System.out.println("Repairing a car");
    }
}

public class vehicleTest {
    public static void main (String []args) {
        Car car = new Car();
        car.drive();
    }
}


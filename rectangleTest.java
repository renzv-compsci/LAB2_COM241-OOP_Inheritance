/* Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides 
 * the getArea() method to calculate the area of the rectangle.
 */

class Shape {
    public void getArea(int length, int width){
        int area;
        area = length * width;

        System.out.println("Area: " + area);
    }
}

class Rectangle extends Shape {
    @Override
    public void getArea(int length, int width){
        int area;
        area = length * width;

        System.out.println("Area: " + area);
    }
}

public class rectangleTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        rect.getArea(13,2);
    }
}
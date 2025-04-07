/* Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the 
 * makeSound() to bark.*/

class Animal {
    public void makeSound(){
        System.out.println("The cat's meow");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound(){
        System.out.println("The cat's bark");
    }
}

public class animalTest {
    public static void main (String []args){
        Cat cat = new Cat();
        cat.makeSound();
    }
    
}
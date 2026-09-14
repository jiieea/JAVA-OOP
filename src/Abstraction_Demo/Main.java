package Abstraction_Demo;


// abstract class
abstract class Animal {
//    abstract method
    public abstract void animalSound();
// regular method
    public void chickenSound() {
        System.out.println("wleee");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("wick");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig objectPig = new Pig();
        objectPig.animalSound();
        objectPig.chickenSound();
    }
}

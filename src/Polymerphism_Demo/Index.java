package Polymerphism_Demo;

 class Animal {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
     public void sound() {
         System.out.println("Dog sound");
     }
}

class Car extends Animal {
    public void sound() {
        System.out.println("Car sound");
    }
}


class Index {
     public static void main(String[] args) {
         Animal animal = new Animal();
         Dog dog = new Dog();
         Car car = new Car();


         animal.sound();
         dog.sound();
         car.sound();
     }
}

package Super_Demo;

 class Animal {
     int age = 15;
    Animal() {
        System.out.println("Animal created");
    }
}

class Dog extends Animal {
     Dog() {
         super(); // call parent constructor
         System.out.println("Dog created  " + super.age); // call parent attribute , tecnically it same as this keyword
     }
}

public class Main {
     public static void main(String[] args) {
         Dog d = new Dog();
     }
}

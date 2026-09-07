public class Person {
    String name;
    int age;
    final String country = "Paris";

    void greeting(String paramName) {
        System.out.println("hello My name is " + name + "You must be " + paramName);
    }

    public void Car(String model) {
        System.out.println("That is" + model);
    }

    public void Speed(String maxSpeed) {
        System.out.println("Its Maximum Speed is around" + maxSpeed);
    }
}


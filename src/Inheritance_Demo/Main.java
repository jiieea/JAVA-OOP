package Inheritance_Demo;

public class Main {
    protected String model = "Lamborghini";
    protected String engine = "V12 Engine";
    protected int year = 1980;

    public void honk() {
        System.out.println("Tutut");
    }

}

 class Car extends Main {
    public String carName = "Huracan";
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(car.model +" " + car.carName);
        System.out.println(car.engine + " " + car.year);
    }
}

package Inheritance_Demo;

public class Main {
    protected String model = "Lamborghini";
    protected String engine = "V12 Engine";
    protected int year = 1980;

    public void honk() {
        System.out.println("Tutut");
    }


//    parent method
    public void carInfo() {
        System.out.println("Ford Mustang 6000cc");
    }
}


 class Car extends Main {
    public String carName = "Huracan";
    public void carPrice() {
//      call parent method through super keyword
        super.carInfo();
        System.out.println("Tutut");
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        car.carPrice();
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(car.model +" " + car.carName);
        System.out.println(car.engine + " " + car.year);
    }
}

public class Person {
    String name;
    int age;
    final String country = "Paris";
    protected String employeeId;
    protected String email = "test@gmail.com";
    private String password = "test123423";

    void greeting(String paramName) {
        System.out.println("hello My name is " + name + "You must be " + paramName);
    }

    void password() {
        System.out.println("passsword = " + password);
    }
    public void Car(String model) {
        System.out.println("That is" + model);
    }

    public void Speed(String maxSpeed) {
        System.out.println("Its Maximum Speed is around" + maxSpeed);
    }
}

  class Employee extends Person {
    public static void main(String[] args) {
        Employee object = new Employee();
//        System.out.println(Employee.password); // error due to private access
        System.out.println("Email = " + object.email);
    }
}


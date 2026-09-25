
// method overloading
class Test {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }
}

// method overriding
class President {
    String name = "Yera";

    void president(String name) {
        System.out.println(name + " president" + "This is " + this.name);
    }
}

class Vice extends President {
    void president(String name) {
        System.out.println(name + " Vice president");
    }
}


public class Index {
    int year;
    String model;


//    one parameter constructor
    public Index(String model) {
        this(1980 , model);
    }

//    two parameter constructor
    public Index(int year , String model) {
        this.model = model;
        this.year = year;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println(year + " " + model);
    }

    public static void main(String[] args) {
        System.out.println(Test.add(5,19));
        System.out.println(Test.add(3.9,2.1));
        Index myObject = new Index("Porsche");
        Vice myVice = new Vice();
        President myPresident = new President();
        myPresident.president("Porsche");
        myVice.president("Yves");
        myObject.printInfo();
        Index secondObj = new Index(2000 , "Mustang");
        secondObj.printInfo();
    }
}
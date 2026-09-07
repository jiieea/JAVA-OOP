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
        Index myObject = new Index("Porsche");
        myObject.printInfo();
        Index secondObj = new Index(2000 , "Mustang");
        secondObj.printInfo();
    }
}
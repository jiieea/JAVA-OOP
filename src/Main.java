class Main {
    public static void main(String[] args) {
        Person myObject = new Person();
        Person newObject = new Person();
        newObject.name = "constantine";
        myObject.name = "Vermilion";
        myObject.greeting("Yves");
        newObject.greeting("Yves");
        newObject.password();
        myObject.Car("Porsche 911");
        myObject.Speed("450 MPH");

        Student myStudent = new Student();
        myStudent.study();
    }
}
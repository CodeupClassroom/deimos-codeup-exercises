package oop;

public class OopImplementation {

    public static void main(String[] args) {
        Person rick = new Person();
        System.out.println("rick.sayHello() = " + rick.sayHello());
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        System.out.println(Person.breathe("air"));

//        Person.liveOnEarth;

        // prints "Hello from Rick Sanchez!"
    }


}

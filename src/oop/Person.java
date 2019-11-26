package oop;

public class Person {

    public String firstName;
    public String lastName;
    public static boolean liveOnEarth = true;
    public static long worldPopulation = 7_500_000_000L;

//    Executes every time that someone makes a new Object()
    public Person(){
        this.worldPopulation++;
    }

    public Person(String firstName, String lastName){

    }

    public String sayHello() {
        return String.format("Hello from %s %s!", this.firstName, this.lastName);
    }

    public static String breathe(String oxygen){
        return "CO2";
    }

}
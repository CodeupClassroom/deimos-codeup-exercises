public class Person {

    // The class has a private name property that is a string
    private String name;

    //The class should have a constructor that accepts a String value and sets the person's name to the passed string.
    public Person(String name) {
        this.name = name;
    }

    // returns the person's name
    public String getName(){
        return this.name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    // prints a message to the console using the person's name
    public void sayHello(){
        System.out.println("Hi, my name is: " + this.name);
    }

    

}

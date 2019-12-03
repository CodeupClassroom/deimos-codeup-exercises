public class InheritanceAndPolymorph {

    public static void main(String[] args) {

        Person mom = new Person("Tomasa");
        mom.sayHello();
        System.out.println("mom.hairColor = " + mom.hairColor);

        Employee fer = new Employee("Fer");
        fer.sayHello();
        fer.doWork();
        fer.setHairColor("blue");
        System.out.println("fer.hairColor = " + fer.hairColor);

        Instructor sophie = new Instructor("Sophie");
        sophie.sayHello();

        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName()); // "Superman"

        theManOfSteel.sayHello();
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"


    }

}

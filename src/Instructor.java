public class Instructor extends Employee {
    public Instructor(String instructorsName){
        super(instructorsName);
    }

    @Override
    public void sayHello(){
        System.out.println("Hello Deimos!");
    }

}

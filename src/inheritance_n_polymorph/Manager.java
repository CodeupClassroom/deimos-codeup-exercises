package inheritance_n_polymorph;

public class Manager extends Employee {

    public Manager(String ManagerName){
        super(ManagerName);
    }

    @Override
    public void doWork() {
        System.out.println("Managing employees");
    }

}

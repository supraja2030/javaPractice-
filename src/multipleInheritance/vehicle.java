package multipleInheritance;

public class vehicle implements car,sportsCar{
    public void start(){
        System.out.println("The vehicle has been started");
    }
    public void stop(){
        System.out.println("The vehicle has been stopped");
    }
    public void engine(){
        System.out.println("The vehicle has engine v6");
    }
    public void doors(){
        System.out.println("The vehicle has 4 doors");
    }

}

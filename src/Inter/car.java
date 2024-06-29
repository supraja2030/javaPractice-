package Inter;

public class car implements vehicle{
    @Override
    public void start(){
        System.out.println("Car has been started");

    }
    @Override
    public void stop(){
        System.out.println("The car has been stopped");
    }
    void engine(){
        System.out.println("Can have engine v6");
    }

}

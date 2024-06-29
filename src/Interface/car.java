package Interface;

public class car implements Vehicle{
    @Override
    public void stop(){
        System.out.println("The car has been stopped ");
    }
    @Override
    public void start(){
        System.out.println("The car has been started ");
    }
    public void doors(){
        System.out.println("The car has 4 doors");
    }
}

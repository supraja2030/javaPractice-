package abstarction;

public class car extends vehicle{
    @Override
    void stop(){
        System.out.println("The car has been stopped");
    }
    @Override
    void start(){
        System.out.println("The cars has been started");
    }
    void doors(){
        System.out.println("The cars has 4 doors");

    }
}

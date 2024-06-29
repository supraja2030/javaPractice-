package Interface;

public class bus implements Vehicle{
    @Override
    public void start(){
        System.out.println("The bus has been started");
    }
    @Override
    public void stop(){
        System.out.println("The bus has been stopped");
    }
    public void doors(){
        System.out.println("The bus has two doors");
    }
}

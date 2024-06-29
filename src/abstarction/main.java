package abstarction;

public class main {
    public static void main(String[] args) {
        vehicle Vehicle1 = new car();
        vehicle Vehicle2 = new bus();

        Vehicle1.start();
        Vehicle1.stop();

        Vehicle2.start();
        Vehicle2.stop();

        if(Vehicle1 instanceof car){
            ((car) Vehicle1).doors();
        }
        if(Vehicle2 instanceof bus){
            ((bus)Vehicle2).doors();
        }


    }
}

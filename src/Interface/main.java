package Interface;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new car();
        Vehicle vehicle2 = new bus();

        vehicle1.stop();
        vehicle1.stop();

        vehicle2.stop();
        vehicle2.start();

        if(vehicle1 instanceof car){
            ((car) vehicle1).doors();
        }
        if(vehicle2 instanceof bus){
            ((bus) vehicle2).doors();
        }
    }
}

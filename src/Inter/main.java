package Inter;

public class main {
    public static void main(String[] args) {
        vehicle Vehicle = new car();
        Vehicle.start();
        Vehicle.stop();
        if(Vehicle instanceof car){
            ((car)Vehicle).engine();
        }
        


    }
}

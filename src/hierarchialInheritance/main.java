package hierarchialInheritance;

public class main {
    public static void main(String[] args) {
        vehicle Vehicle = new vehicle();
        car Car = new car();
        sportsCar sportscar = new sportsCar();

        Vehicle.start();
        Vehicle.stop();

        Car.start();
        Car.stop();
        Car.doors();

        sportscar.start();
        sportscar.stop();
        sportscar.doors();
        sportscar.engine();

    }
}

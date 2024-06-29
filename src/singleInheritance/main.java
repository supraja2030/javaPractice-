package singleInheritance;

public class main {
    public static void main(String[] args) {
        vehicle Vehicle = new vehicle();
        car Car = new car();

        Vehicle.start();
        Vehicle.stop();

        Car.start();
        Car.stop();

        Car.name();
        Car.engine();
    }
}

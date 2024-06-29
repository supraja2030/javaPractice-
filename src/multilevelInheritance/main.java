package multilevelInheritance;

public class main {
    public static void main(String[] args) {
        vehicle Vehicle = new vehicle();
        car Car = new car();
        bus Bus = new bus();

        Vehicle.stop();
        Vehicle.start();

        Car.start();
        Car.stop();
        Car.name();
        Car.engine();

        Bus.stop();
        Bus.stop();
        Bus.seats();
        Bus.wheels();
    }
}


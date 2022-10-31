package lecture02.Kadai2;

public class Kadai3 {
    public static void main(String args[]) {

        Tire[] tires = new Tire[4];
        Engine engine = new Engine(4000);
        Car car = new Car(tires, engine);
        GasStation gasStation = new GasStation();

        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire(65);
        }

//        for(Tire tire:tires){
//            tire = new Tire(65);
//        }

        gasStation.refuel(car);
        car.stratEngine();
        car.run();
    }
}



public class StaticDemo1 {
    public static void main(String[] args) {
        Car car1 = new Car("Jaguar", "V8");
        Car car2 = new Car("Bugatti", "W16");
        System.out.println("Number of cars=" + Car.numberOfCars);
    }
}

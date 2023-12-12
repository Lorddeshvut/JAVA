public class Factory {
    public static Car build(CarType type) {
        Car car = null;
        return switch (type) {
            case TOYOTA -> new ToyotaCar();
            case BMW -> new BMW_Car();
            case AUDI -> new AudiCar();
            //default -> throw new IllegalArgumentException("Car type not supported");
        };
    }
}

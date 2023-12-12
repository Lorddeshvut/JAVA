public class AudiCar extends Car{
    String audiWheels = "Audi wheels";
    String audiEngine = "Audi engine";
    String audiBody = "Audi body";
    @Override
    public void setWheels(String wheels) {
        this.audiWheels= wheels;
    }
    @Override
    public void setEngine(String engine) {
        this.audiEngine= engine;
    }
    @Override
    public void setBody(String body) {
        this.audiBody= body;
    }

    @Override
    public void create() {
        System.out.println("Audi car created" + "\n" + "Wheels: " + audiWheels +
                "\n" + "Engine: " + audiEngine + "\n" + "Body: " + audiBody);
    }
}

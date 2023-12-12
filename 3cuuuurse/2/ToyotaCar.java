public class ToyotaCar extends Car{
    String toyotaWheels = "Toyota wheels";
    String toyotaEngine = "Toyota engine";
    String toyotaBody = "Toyota body";

    @Override
    public void setEngine(String engine) {
        this.toyotaEngine= engine;
    }

    @Override
    public void setBody(String body) {
        this.toyotaBody= body;
    }

    @Override
    public void setWheels(String wheels) {
        this.toyotaWheels= wheels;
    }

    @Override
    public void create() {
        System.out.println("Toyota car created" + "\n" + "Wheels: " + toyotaWheels +
                "\n" + "Engine: " + toyotaEngine + "\n" + "Body: " + toyotaBody);
    }
}

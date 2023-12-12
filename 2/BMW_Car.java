public class BMW_Car extends Car{
    String bmwWheels = "BMW wheels";
    String bmwEngine = "BMW engine";
    String bmwBody = "BMW body";

    @Override
    public void setWheels(String wheels) {
        this.bmwWheels= wheels;
    }
    @Override
    public void setEngine(String engine) {
        this.bmwEngine= engine;
    }
    @Override
    public void setBody(String body) {
        this.bmwBody= body;
    }

    @Override
    public void create() {
        System.out.println("BMW car created" + "\n" + "Wheels: " + bmwWheels +
                "\n" + "Engine: " + bmwEngine + "\n" + "Body: " + bmwBody);
    }

}

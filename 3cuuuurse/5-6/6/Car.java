public class Car extends Drive{
    @Override
    public void openTheDoor() {
        System.out.println("You are opening a car door!");
    }
    @Override
    public void sitDown() {
        System.out.println("You are sitting in the car!");
    }
    @Override
    public void startEngine() {
        System.out.println("You are starting a car engine!");
    }
    @Override
    public void stopEngine() {
        System.out.println("You are stopping a car engine!");
    }
}

public class Train extends Drive{
    @Override
    public void openTheDoor() {
        System.out.println("You are opening a train door!");
    }
    @Override
    public void startEngine() {
        System.out.println("You are starting a train engine!");
    }

    @Override
    public void sitDown() {

    }

    @Override
    public void stopEngine() {
        System.out.println("You are stopping a train engine!");
    }
}

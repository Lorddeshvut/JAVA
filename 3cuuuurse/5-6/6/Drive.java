public abstract class Drive {
public void drive() {
        startEngine();
        sitDown();
        openTheDoor();
        move();
        stopEngine();
    }

    public abstract void startEngine();
    public abstract void sitDown();
    public abstract void openTheDoor();
    public abstract void stopEngine();
    public final void move(){
        System.out.println("You are moving!");
    };

}

import java.util.List;

public class Patients implements Observer{
    private final String name;
    public Patients(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Patient " + name + " has received a message: " + message);
    }

}

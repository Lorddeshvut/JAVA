import java.util.*;

public class Notification implements Observable{
    private final List<Observer> patients = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        patients.add(observer);
        System.out.println("Patient has subscribed to notifications.");
    }
    @Override
    public void unsubscribe(Observer observer) {
        patients.remove(observer);
        System.out.println("Patient has unsubscribed from notifications.");
        }
    @Override
    public void notifyObservers(String results) {
           for (Observer observer : patients) {
                observer.update(results);
        }
    }
    @Override
    public void result(String result) {
        notifyObservers(result);
    }
}

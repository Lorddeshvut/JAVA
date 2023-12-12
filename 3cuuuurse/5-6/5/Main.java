/*Создайте систему мониторинга здоровья, где пациенты могут
        подписываться на уведомления о результатах своих медицинских анализов.*/
public class Main {
    public static void main(String[] args) {
        Patients patient1 = new Patients("Ivan");
        Patients patient2 = new Patients("Petr");
        Notification notification = new Notification();
        notification.subscribe(patient1);
        notification.subscribe(patient2);
        notification.notifyObservers("You have a siphilis!");
        notification.unsubscribe(patient1);
        notification.notifyObservers("You have a COVID-19!");
    }
}
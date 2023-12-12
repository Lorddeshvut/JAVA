/*Создайте приложение для управления задачами, которое позволяет
        сохранять и восстанавливать список задач и их статус выполнения.*/
public class Main {
    public static void main(String[] args) {
        Tasks tasks = new Tasks("Task 1", true);
        Tasks tasks1 = new Tasks("Task 2", false);
        Tasks tasks2 = new Tasks("Task 3", true);
        Tasks tasks3 = new Tasks("Task 4", false);
        System.out.println(tasks);
        System.out.println(tasks1);
        System.out.println(tasks2);
        System.out.println(tasks3);
        System.out.println("Save:");
        Memento memento = tasks.createMemento();
        System.out.println(tasks);
        Memento memento1 = tasks1.createMemento();
        tasks1.setStatusTask(true);
        System.out.println(tasks1);
        Memento memento2 = tasks2.createMemento();
        System.out.println(tasks2);
        Memento memento3 = tasks3.createMemento();
        tasks3.setStatusTask(true);
        System.out.println(tasks3);
        tasks.restore(memento);
        tasks1.restore(memento1);
        tasks2.restore(memento2);
        tasks3.restore(memento3);
        System.out.println("Restore:");
        System.out.println(tasks);
        System.out.println(tasks1);
        System.out.println(tasks2);
        System.out.println(tasks3);
    }
}
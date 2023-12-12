/*Реализуйте паттерн "Фасад" для системы управления библиотекой,
        объединяющий функции поиска книг, оформления заказов и проверки наличия книг.*/
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.searchBooks();
        System.out.println("_______________________________________");
        facade.orderBooks();
    }
}
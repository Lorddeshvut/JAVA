public class Facade {
    private final Library library;
    private final Order order;

    public Facade() {
        library = new Library();
        order = new Order();
    }
    public void searchBooks() {
        library.checkRoom();
        library.checkShelf();
        library.searchBooks();
    }
    public void orderBooks() {
        order.placeOrder();
        order.orderBooks();
        order.delivery();
    }
}

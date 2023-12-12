/*Создайте систему управления производством автомобилей, где каждая фабрика может производить
        разные компоненты (двигатели, колеса, кузовы) для разных марок автомобилей.
        Используйте паттерн "Абстрактная фабрика".*/
public class Main {
    public static void main(String[] args) {
        Factory.build(CarType.BMW).create();
        Factory.build(CarType.TOYOTA).create();
    }
}
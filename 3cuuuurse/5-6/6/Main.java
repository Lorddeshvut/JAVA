/*Разработайте программу для управления разными видами транспорта
        (автомобили, велосипеды, поезда), где разные виды транспорта используют общий шаблонный метод для движения.*/
public class Main {
    public static void main(String[] args) {
        Drive car = new Car();
        Drive train = new Train();
        Drive bicycle = new Bicycle();
        car.drive();
        System.out.println("-----------------------------");
        train.drive();
        System.out.println("-----------------------------");
        bicycle.drive();
    }
}
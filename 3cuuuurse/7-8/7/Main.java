/*Реализуйте паттерн "Строитель" для объектов "Компьютер"
        (Computer) с параметрами, такими как процессор, оперативная память, жесткий диск и графическая карта.*/
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .setProcessor("Intel Core i5")
                .setRam("DDR4 8GB")
                .setHdd("1TB")
                .setGraphicsCard("Nvidia GeForce GTX 1050")
                .build();
        System.out.println(computer);
        Computer computer2 = new Computer.Builder()
                .setProcessor("Intel Core i7")
                .setRam("DDR4 16GB")
                .setHdd("2TB")
                .setGraphicsCard("Nvidia GeForce GTX 1080")
                .build();
        System.out.println(computer2);
    }
}
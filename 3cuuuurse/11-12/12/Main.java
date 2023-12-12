/*Создайте систему управления географическими объектами по паттерну
        "Компоновщик", такими как страны, регионы и города, объединяя их в иерархическую структуру.*/
public class Main {
    public static void main(String[] args) {
        Country country = new Country("Russia", 493848000, 146748590);
        Region region = new Region("Siberia", 309000, 14800000);
        City city = new City("Novosibirsk", 203099, 1612833);
        country.add(region);
        region.add(city);
        country.print();

    }
}
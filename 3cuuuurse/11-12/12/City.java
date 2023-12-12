import java.util.ArrayList;

public class City extends Region{
    ArrayList<Region> regions = new ArrayList<Region>();
    public City(String name, int capital, int population) {
        super(name, capital, population);
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
    @Override
    public void print() {
        System.out.println("City: " + name + ", capital: " + capital + ", population: " + population);
    }
    @Override
    public void add(Component component) {
        regions.add((Region) component);
    }
    @Override
    public void remove(Component component) {
        regions.remove((Region) component);
    }
}

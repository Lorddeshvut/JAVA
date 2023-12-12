import java.util.ArrayList;

public class Region extends Country{
    ArrayList<Country> countries = new ArrayList<Country>();
    public Region(String name, int capital, int population) {
        super(name, capital, population);
        this.name = name;
        this.capital = capital;
        this.population = population;
    }
    @Override
    public void print() {
        System.out.println("Region: " + name + ", capital: " + capital + ", population: " + population);
        for (Country country : countries) {
            country.print();
        }
    }
    @Override
    public void add(Component component) {
        countries.add((Country) component);
    }

    @Override
    public void remove(Component component) {
        countries.remove((Country) component);
    }
}
